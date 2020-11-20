package httpserver;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Application3 {

	final private static int PORT = 8081;

	public static void main(String[] args) {

		final String html = "<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "    <head>\r\n"
				+ "        <title>Hello HTTP Server!</title>\r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "        <h1>�����̰�</h1>\r\n"
				+ "        <p>�����̾�</p>\r\n"
				+ "    </body>\r\n"
				+ "</html>";
		
		try {
			// ���ϻ���
			final ServerSocket serverSocket = new ServerSocket(PORT);
			Socket socket;

			//���Ӵ��
			while((socket = serverSocket.accept()) != null) {
				System.out.println("Someone contect!!!");

				// ��Ʈ�� ����
				final InputStream in = socket.getInputStream();
				final BufferedReader br = new BufferedReader(new InputStreamReader(in));

				// ��û ����
				String line;
				while(!(line = br.readLine()).equals("")) {
					System.out.println(line);
				}

				// 3. html
				final OutputStream out = socket.getOutputStream();
				// 3.1. ���� ����
				final String statusLine = "HTTP/1.1 200 OK \r\n";
				out.write(convertStringToBytes(statusLine));

				// 3.2. ���
				final String contentType = "content-Type: text/html; charset=utf-8 \r\n";
				// Content-Type: text/html;
				out.write(convertStringToBytes(contentType));
				// Content-Length: 160
				final String contentLength = "Content-Length: " + html.length() + "\r\n";
				out.write(convertStringToBytes(contentLength));
				// �ش� ���� ������ֱ� ���� CRLF(Carraige Return Line Feed)�� ����.
				out.write(convertStringToBytes("\r\n"));
				
				
				
				// 3.3. �ٵ�
				out.write(convertStringToBytes(html));
				out.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static byte[] convertStringToBytes(String strToConvert) {
		return strToConvert.getBytes(StandardCharsets.UTF_8);
	}
}

