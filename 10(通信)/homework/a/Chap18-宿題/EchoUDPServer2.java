import java.net.*;
import java.io.IOException;

public class EchoUDPServer2 {
	public static void main(String args[]) {
		final DatagramSocket socket;
		DatagramPacket inPacket = null;
		try {
			socket = new DatagramSocket(7);
			try {
				while (true) {		
					// Prepare data.
					
					// Make DatagramPacket for input. 
					
					// Receive packet.
					
					// Print data received.
					
					// Obtain socket address.
					final SocketAddress inpacketSocketAddress = inPacket.getSocketAddress(); 
					
					// Make Thread-Per-Message.
					new Thread() {
						public void run() {
							try {
								// Make DatagramPacket for output.
								
								// Send packet.
								
								// Print data sent.
								
							} catch(IOException se) {
							}
						}
					}.start();
				}
			} finally {
				if (socket != null) socket.close();
			}
		} catch (IOException ioe) {
			System.err.println(ioe);
		}
	}
}
