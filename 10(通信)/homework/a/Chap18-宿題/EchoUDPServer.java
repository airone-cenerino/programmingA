import java.net.*;
import java.io.IOException;

public class EchoUDPServer {
	public static void main(String args[]) {
		DatagramSocket socket = null;
		try {
			socket = new DatagramSocket(7);
			while (true) {
				// Prepare data.
				
				// Make DatagramPacket for input. 
				
				// Receive packet.
				
				// Make DatagramPacket for output.
				
				// Send packet.
				
			}
		} catch (IOException ioe) {
			System.err.println(ioe);
		} finally {
			if (socket != null) socket.close();
		}
	}
}
