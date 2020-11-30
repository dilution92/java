package client;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ListenerThread extends Thread {
	private final Socket socket;

	public ListenerThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			final InputStream in = socket.getInputStream();
			final byte[] buffer = new byte[4096];
			int readByte;
			
			while((readByte = in.read(buffer)) != -1) {
				final String message = new String(buffer, StandardCharsets.UTF_8);
				System.out.println(message);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
