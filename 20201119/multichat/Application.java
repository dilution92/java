package multichat;

import java.net.ServerSocket;
import java.net.Socket;

public class Application {

	private static final int PORT = 12345;

	public static void main(String[] args) {

		try {
			final ServerSocket serverSocket = new ServerSocket(PORT);
			Socket client;
			while ((client = serverSocket.accept()) != null) {
				System.out.println("새로운 클라이언트 접속!");
				ClientManager.registerClient(client);
			}
		} catch (Exception e) {
			e.printStackTrace();		
		}

	}

}
