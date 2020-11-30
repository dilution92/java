package client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Application {

	private static final int PORT = 12345;
	private static final String ID_ADRESS = "127.0.0.1";
	
	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket(ID_ADRESS, PORT);
			final ListenerThread listener = new ListenerThread(socket);
			listener.start();
			
			while(true) {
				sendMessage(socket.getOutputStream());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void sendMessage(OutputStream out) throws IOException {
		final Scanner sc = new Scanner(System.in);
		System.out.println("ют╥б >> ");
		final String messageTosend = sc.nextLine();
		out.write(messageTosend.getBytes(StandardCharsets.UTF_8));
		out.flush();
	}

}
