import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class GameGuess {
    private static final int PORT = 12345;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int TIMEOUT_SECONDS = 30;
    private static final int REQUIRED_CLIENTS = 2;

    
    private int secretNumber;
    private List<ClientHandler> clients = Collections.synchronizedList(new LinkedList<>());
    private int turnIndex = 0; 
    private boolean gameInProgress = false;


    private final Object turnLock = new Object();

    public static void main(String[] args) {
        new GameGuess().startServer();
    }

    public void startServer() {
        System.out.println(" Server Starting...");
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println(" New player connected: " + clientSocket.getInetAddress());
                ClientHandler clientThread = new ClientHandler(clientSocket);
                clients.add(clientThread);
                clientThread.start(); 

                  if (clients.size() == REQUIRED_CLIENTS && !gameInProgress) {
                    startGame();
                }
              
            }
            
            
        } catch (IOException e) {
            System.err.println("Error while starting the server: " + e.getMessage());
        }
    }

    private void startGame() {
        secretNumber = new Random().nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
        turnIndex = 0;
        gameInProgress = true;
        System.out.println(" Game Started! The secret number is: " + secretNumber); 

        broadcast(" New round started! Guess the number (between " + MIN_NUMBER + " and " + MAX_NUMBER + ".)");
        
        synchronized (turnLock) {
            turnLock.notifyAll();
        }
    }

    private void nextTurn() {
        if (!gameInProgress) return;

    
        turnIndex = (turnIndex + 1) % clients.size();
        
    
        synchronized (turnLock) {
            turnLock.notifyAll();
        }
    }

    private void broadcast(String message) {
        synchronized (clients) {
            for (ClientHandler client : clients) {
                client.sendMessage(message);
            }
        }
    }

    private void handleWin(ClientHandler winner, int guess) {
        gameInProgress = false;
        String winMessage = "Winner is: " + winner.getClientId();
        broadcast(winMessage);
        System.out.println(winMessage);
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {}

        
        if (clients.size() >= REQUIRED_CLIENTS) {
             startGame();
        } else {
             broadcast("Waiting for players to start round");
        }
    }

    
    private class ClientHandler extends Thread {
        private Socket clientSocket;
        private PrintWriter out;
        private BufferedReader in;
        private String clientId;
        private boolean running = true;

        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
            this.clientId = "Player-" + clients.size(); 
        }

        public String getClientId() {
            return clientId;
        }

        
        public void sendMessage(String message) {
            if(out != null) {
                 out.println(message);
            }
        }

        @Override
        public void run() {
            try {
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                sendMessage("Wellcome Player " + clientId + ".");

                while (running) {
                    if (!gameInProgress) {
                        sendMessage("Waiting " + REQUIRED_CLIENTS + " Current players: " + clients.size());
                        
                        
                        synchronized (turnLock) {
                           try{ turnLock.wait(); 
                           } catch(InterruptedException e){
                            running = false;
                            break;
                           }
                        }
                    }
                    

                
                    synchronized (turnLock) {
                        while (clients.indexOf(this) != turnIndex && gameInProgress) {
                            sendMessage("Turn: " + clients.get(turnIndex).getClientId());
                           try { turnLock.wait();
                            } catch (InterruptedException e) {
                                running = false;
                                break;
                            }
                        }
                    }

                    if (!gameInProgress) continue; 

                    sendMessage("Your turn! (between " + MIN_NUMBER + " and " + MAX_NUMBER + "):");

                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<String> future = executor.submit(() -> in.readLine());
                    
                    String guessLine;
                    try {
                        
                        guessLine = future.get(TIMEOUT_SECONDS, TimeUnit.SECONDS); 
                    } catch (TimeoutException e) {
                        future.cancel(true);
                        sendMessage("Timeout next turn");
                        executor.shutdownNow();
                        nextTurn(); 
                        continue;
                    } catch (ExecutionException | InterruptedException e) {
                        break; 
                    } finally {
                        executor.shutdownNow();
                    }

                    if (guessLine == null) break; 

                    try {
                        int guess = Integer.parseInt(guessLine.trim());
                     
                        if (guess == secretNumber) {
                            sendMessage("GG you won " + guess);
                            handleWin(this, guess);
                        } else if (guess < secretNumber) {
                            sendMessage("Bigger than " + guess);
                            nextTurn();
                        } else {
                            sendMessage("Lower than " + guess);
                            nextTurn();
                        }
                    } catch (NumberFormatException e) {
                        sendMessage("Input number!");
            
                    }
                }

            } catch (IOException e) {
                System.out.println("Player " + clientId + " left");
            } finally {
                running = false;
                clients.remove(this); 
                if (clients.indexOf(this) == turnIndex && gameInProgress) { 
                    nextTurn(); 
                }
                if (clients.size() < REQUIRED_CLIENTS && gameInProgress) {
                     gameInProgress = false;
                     broadcast("Bye");
                }

                try { clientSocket.close(); } catch (IOException ignored) {}
            }
        }
    }
}

