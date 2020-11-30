package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client extends Thread{
	
	private final Socket socket;
	
	public Client(Socket clientSocket) {
		socket = clientSocket;
	}
	
	@Override
	public void run() {
		try {
			final InputStream in = socket.getInputStream();
			final byte[] buffer = new byte[4096];
			int readByte;
			
			while((readByte = in.read(buffer)) != -1) {
				final String dataFromClient = 
						new String(buffer, StandardCharsets.UTF_8);
				final String message = String.format("[%s]: %s", socket.getInetAddress().getHostAddress(), dataFromClient);
				ClientManager.getInstance().broadcast(message);
			}
					
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendMessage(String message) {

		try {
			final OutputStream out = socket.getOutputStream();
			out.write(message.getBytes(StandardCharsets.UTF_8));
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
