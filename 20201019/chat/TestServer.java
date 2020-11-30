package com.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

	ServerSocket ssc;
	Socket sc;

	DataInputStream input;
	DataOutputStream output;

	public void serverSet() {
		try {
			ssc = new ServerSocket(7000);
			sc = ssc.accept();

			input = new DataInputStream(sc.getInputStream());
			output = new DataOutputStream(sc.getOutputStream());

			while (input != null) {
				String s = "Client > " + input.readUTF();
				TestServerGUI.textArea.append(s);
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
