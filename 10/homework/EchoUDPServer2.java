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
					byte[] inData = new byte[256];
					
					// Make DatagramPacket for input. 
					inPacket = new DatagramPacket(inData, inData.length);
					
					// Receive packet.
					socket.receive(inPacket);
					
					// Print data received.
					System.out.print(Thread.currentThread());
					System.out.print(" received : ");
					System.out.write(inData);
					System.out.println();
					
					// Obtain socket address.
					final SocketAddress inpacketSocketAddress = inPacket.getSocketAddress(); 


					// Make Thread-Per-Message.
					new Thread() {
						public void run() {
							try {
								// Make DatagramPacket for output.
								DatagramPacket outPacket = new DatagramPacket(inData, inData.length, inpacketSocketAddress);
				
								// Send packet.
								socket.send(outPacket);			

								// Print data sent.
								System.out.print(Thread.currentThread());
								System.out.print(" sent : ");
								System.out.write(inData);
								System.out.println();

								
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
