package client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Application {

	// Ŭ���̾�Ʈ �������� 

	// ������ ���� �ּ�
	private static final String IP_ADDRESS = "192.168.40.124";
	private static final int PORT = 12345;

	public static void main(String[] args) {

		try {
            // 1. ����
            final Socket socket = new Socket(IP_ADDRESS, PORT);
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
		System.out.println("�Է� > ");
		final String messageTosend = sc.nextLine();
		out.write(messageTosend.getBytes(StandardCharsets.UTF_8));
		out.flush();
	}

}
