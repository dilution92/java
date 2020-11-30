package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Application {

	private static final int PORT = 12345;
	
	public static void main(String[] args) {
		
		 try {
			 //辑滚 家南 积己
			ServerSocket serverSocket = new ServerSocket(PORT);
			Socket socket;
			System.out.println("立加 措扁吝...");
			socket = serverSocket.accept();
			System.out.println("立加凳");
			
			recvMessage(socket.getInputStream());
			sendMessage(socket.getOutputStream());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void sendMessage(OutputStream out) {
		Scanner sc = new Scanner(System.in);
		String messageToClient = sc.nextLine();
		System.out.println(messageToClient);
	}

	private static void recvMessage(InputStream in) throws IOException {
		byte[] buffer = new byte[4069];
		int readByte;
		
		while((readByte = in.read(buffer)) != -1) {
			String messageFromClient = new String(buffer);
			System.out.println(messageFromClient);
		}
	}

}
