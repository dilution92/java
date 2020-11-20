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
				+ "        <h1>제목이고</h1>\r\n"
				+ "        <p>내용이야</p>\r\n"
				+ "    </body>\r\n"
				+ "</html>";
		
		try {
			// 소켓생성
			final ServerSocket serverSocket = new ServerSocket(PORT);
			Socket socket;

			//접속대기
			while((socket = serverSocket.accept()) != null) {
				System.out.println("Someone contect!!!");

				// 스트림 연결
				final InputStream in = socket.getInputStream();
				final BufferedReader br = new BufferedReader(new InputStreamReader(in));

				// 요청 라인
				String line;
				while(!(line = br.readLine()).equals("")) {
					System.out.println(line);
				}

				// 3. html
				final OutputStream out = socket.getOutputStream();
				// 3.1. 상태 라인
				final String statusLine = "HTTP/1.1 200 OK \r\n";
				out.write(convertStringToBytes(statusLine));

				// 3.2. 헤더
				final String contentType = "content-Type: text/html; charset=utf-8 \r\n";
				// Content-Type: text/html;
				out.write(convertStringToBytes(contentType));
				// Content-Length: 160
				final String contentLength = "Content-Length: " + html.length() + "\r\n";
				out.write(convertStringToBytes(contentLength));
				// 해더 끝을 명시하주기 위해 CRLF(Carraige Return Line Feed)를 넣음.
				out.write(convertStringToBytes("\r\n"));
				
				
				
				// 3.3. 바디
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

