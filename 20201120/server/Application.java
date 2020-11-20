package server;

import java.io.IOException;
import java.net.*;

public class Application {

	// port ��ȣ�� 2^32-1 ��
	private static final int PORT = 12345;
	
	public static void main(String[] args) {

	try {
		final ServerSocket serverSocket = new ServerSocket(PORT);
		Socket clientSocket;
		while((clientSocket = serverSocket.accept()) != null) {
		ClientManager.registerClient(clientSocket);
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
