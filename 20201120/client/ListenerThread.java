package client;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

import server.ClientManager;

// inputstream�� �о ȭ�鿡 �����


public class ListenerThread extends Thread {

	private final Socket socket;

	public ListenerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		try {
			final InputStream in = socket.getInputStream();
			final byte[] buffer = new byte[4096];   // �޼��� ���� ��
			int readBytes;  // ���� �޼��� ����Ʈ ��
			while ((readBytes = in.read(buffer)) != -1) {
				final String message = new String(buffer, StandardCharsets.UTF_8);
				System.out.println(message);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
