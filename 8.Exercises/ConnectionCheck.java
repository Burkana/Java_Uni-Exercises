import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.net.*;
import java.util.*;

public class ConnectionCheck {

    public static void main(String[] args){
     try( Scanner sc = new Scanner(System.in); Scanner scl = new Scanner(System.in)){
      int n = sc.nextInt();
     try{
        String [] REQUEST = new String [n];
        for(int i = 0; i < n; i++){
            REQUEST[i] = scl.nextLine();
        }
        for(int i = 0; i < n; i++){
        URL server = new URL(REQUEST[i]);
        URLConnection conn = server.openConnection();
        String serverInfo = conn.getHeaderField("Server");

        if(serverInfo != null){
            System.out.println(serverInfo);
        }
        else{
            if(conn.getContentLength() == -1){
              System.out.println("Missing web connection");
            }
            else{
                System.out.println("No defined name for web server");
            }
        }
    }
}
      
      catch (MalformedInputException ex){
        System.out.println("Invalid request");
     }  catch (IOException ex){
        System.out.println("Error with communication");
     } 
    }



      try{
                InetAddress host = InetAddress.getByName("localhost");//host object
        String hostName = host.getHostName();
        String hostAddress = host.getHostAddress();
             System.out.println("Host name: " + hostName);
        System.out.println("Host address: " + hostAddress);
    
         } 
    catch (UnknownHostException ex){
        System.out.println("Unknown Host");
     }
      


    }
}
    
    

