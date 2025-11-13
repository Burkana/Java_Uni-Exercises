import java.io.*;
import java.net.*;
import java.util.Scanner;

public class GuessingGameClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try (
            Socket socket = new Socket(SERVER_ADDRESS, PORT);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in)
        ) {
            System.out.println("Server Started on" + SERVER_ADDRESS + ":" + PORT);

            Thread serverListener = new Thread(() -> {
                String serverResponse;
                try {
                    while ((serverResponse = in.readLine()) != null) {
                        System.out.println("\n[Server]: " + serverResponse);
                        if (serverResponse.startsWith("Your Turn!")) {
                            System.out.print(":");
                        } else {
                            System.out.print(""); 
                        }
                    }
                } catch (IOException e) {
                    System.err.println("Lost Connection.");
                }
            });
            serverListener.start();


            while (!socket.isClosed()) {
                String input = scanner.nextLine();
                out.println(input);
            }

            serverListener.interrupt();
        } catch (IOException e) {
            System.err.println("Error while starting the server: " + e.getMessage());
        }
    }
}