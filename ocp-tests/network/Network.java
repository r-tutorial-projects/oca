import java.net.*;

public class Network {

	private final static int serverPort = 5555;
	private final static int clientPort = 5556;                                                                                                                                      
	private final static int bufferSize = 1024;
	private final static byte[] buffer = new byte[bufferSize];                                                                                                                                              
	private final DatagramSocket ds;

	private Network(int port) throws Exception {
		ds = new DatagramSocket(port);
	}

	public static void main(String... args) throws Exception {
		if(args.length == 0)
			new Network(serverPort).server();
		else
			new Network(clientPort).client();
	}

	private void server() throws Exception {
		int pos = 0;
		while(true) {
			int c = System.in.read();
			switch(c) {
				case -1:
					System.out.println("Server quits");
					ds.close();
					return;
				case '\r':
					break;
				case '\n':
					ds.send(new DatagramPacket(buffer, pos, InetAddress.getLocalHost(), clientPort));
					pos = 0;
					break;
				default:
					buffer[pos++] = (byte) c;
					break;

			}
		}
	}

	private void client() throws Exception {
		while(true) {
			DatagramPacket p = new DatagramPacket(buffer, buffer.length);
			ds.receive(p);
			System.out.println(new String(p.getData(), 0, p.getLength()));
		}
	}
}
