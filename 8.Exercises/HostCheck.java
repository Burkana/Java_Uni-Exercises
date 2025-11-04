import java.io.IOException;
import java.net.*;

public class HostCheck {
    static final int[] PORTS = {80, 443, 8080, 53, 21, 22, 23, 25, 110, 143};// Most used PORTS
    static final int TIMEOUT = 6000;// TTL
    static final String HOST_NAME = "www.google.com"; //Host name

    public static void main(String[] args) {
        try {
            // All IP
            InetAddress[] addresses = InetAddress.getAllByName(HOST_NAME);

            System.out.println("Host name: " + HOST_NAME);
            System.out.println("Found " + addresses.length + " IP addresses:");
            for (InetAddress ip : addresses) {
                System.out.println(" - " + ip.getHostAddress());
            }

           // Check for ports for each IP
            for (InetAddress ip : addresses) {
                System.out.println("\nChecking ports for: " + ip.getHostAddress());

                for (int port : PORTS) {
                    try (Socket socket = new Socket()) {
                        socket.connect(new InetSocketAddress(ip, port), TIMEOUT);
                        System.out.println("  Port " + port + " is OPEN");
                    } catch (SocketTimeoutException ste) {
                        System.out.println("  Port " + port + " timed out (no response)");
                    } catch (IOException ioe) {
                        System.out.println("  Port " + port + " is CLOSED");
                    }
                }
            }

        } catch (UnknownHostException ex) {
            System.out.println("No host found. Provide a different host name.");
        }
    }
}
