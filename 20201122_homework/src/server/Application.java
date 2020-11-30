package server;

import java.net.ServerSocket;
import java.net.Socket;

public class Application {

	private static final int PORT = 12345;
	
	public static void main(String[] args) {
		
		try {
			final ServerSocket serverSocket = new ServerSocket(PORT);
			Socket clientSocket;
			while((clientSocket = serverSocket.accept()) != null) {
				ClientManager.registerClient(clientSocket);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
