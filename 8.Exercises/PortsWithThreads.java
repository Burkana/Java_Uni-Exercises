import java.io.IOException;
import java.net.*;
import java.util.*;

public class PortsWithThreads {
   
    static final int PORTS = 80; // Start
    static final int END_PORT = 600; // End
    static final int TIMEOUT = 10000; // TTL
    static final String[] HOST_NAME = new String[10]; //Host name

    static Socket socket;
    static InetAddress ip;
    
    static class ScanThread extends Thread{
     public ScanThread(String s){
        super(s);
     }
     @Override
     public void run(){
        int port = Integer.parseInt(getName());
        try
        {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(ip, port), TIMEOUT);
            System.out.println(port);
            socket.close();
            
        } catch(IOException ex){
        }
        finally
        {
           socket = null;
        }
     }
    }
    public static void main(String ...pars) {
    try( Scanner sc = new Scanner(System.in); Scanner scl = new Scanner(System.in)){
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            HOST_NAME[i] = scl.nextLine();
        }
    
        try{
        InetAddress host = InetAddress.getByName("localhost");
        String hostName = host.getHostName();
        String hostAddress = host.getHostAddress();
        System.out.println("Local host name: " + hostName);
        System.out.println("Host address: " + hostAddress);
        }
        catch (UnknownHostException ex){
        System.out.println("Unknown Host");
        }

        for(int i = 0; i < n; i++){
        try {
            ip = InetAddress.getByName(HOST_NAME[i]);
            InetAddress [] address = InetAddress.getAllByName(HOST_NAME[i]);
            System.out.println("Host name: " + HOST_NAME[i]);
            System.out.println("Found " + address.length + " IP addresses:");
     
            for (InetAddress ip : address) {
                System.out.println(" - " + ip.getHostAddress());
            }
            System.out.println("Open port: ");
            for(int j = PORTS; j <= END_PORT; j++){
            (new ScanThread("" + j)).start();
        }
          
        } catch (UnknownHostException uhs) {
            System.out.println("Invalid");
            return;
        }
         
   }
    }
}
}


