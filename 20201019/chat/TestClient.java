package com.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TestClient {

	Socket sc;
	DataInputStream input;
	DataOutputStream output;

	public void connect() {
		try {
			sc = new Socket("127.0.0.1", 7000);
			System.out.println("서버 연결 완료");

			input = new DataInputStream(sc.getInputStream());
			output = new DataOutputStream(sc.getOutputStream());

			while (input != null) {
				String s = "Server > " + input.readUTF();
				TestClientGUI.textArea.append(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void msgSend(String message) {

		try {

			output.writeUTF(message);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
