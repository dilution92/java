package client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Application {
	
	private static final int PORT = 12345;
	private static final String IP_ADRESS = "Localhost";

	public static void main(String[] args) {
		
		try {
			final Socket clientsocket = new Socket(IP_ADRESS,PORT);
			OutputStream out = clientsocket.getOutputStream();
			System.out.println("Á¢¼ÓµÊ");
			
			Scanner sc = new Scanner(System.in);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
