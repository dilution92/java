package server;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class ClientManager {
	
	private static final ClientManager INSTANCE = new ClientManager(); 
	
	private List<Client> clients = new ArrayList<>();
	
	public static void registerClient(Socket clientSocket) {
		getInstance().addClient(clientSocket);
		
	}

	private void addClient(Socket clientSocket) {
		final Client client = new Client(clientSocket);
		clients.add(client);
		client.start();
	}

	public static ClientManager getInstance() {
		return INSTANCE;
	}

	public void broadcast(String message) {
		for(Client client : clients) {
			client.sendMessage(message);
		}
		
	}

	
	
}
