package httpserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Application2 {

    // localhost:8081
    private static final int PORT = 8081;

    public static void main(String[] args) {
        try {
            final ServerSocket serverSocket = new ServerSocket(PORT);
            Socket socket;
            while ((socket = serverSocket.accept()) != null) {
                // 1. 요청을 읽어서 화면에 출력
                final InputStream in = socket.getInputStream();
                final BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String line;
                while (!(line = br.readLine()).equals("")) {
                    System.out.println(line);
                }
                
                
                
                // 2. 응답 생성
                // 2.1. 상태 라인 작성
                final String statusLine = "HTTP/1.1 200 OK \r\n";
                // 2.2. 메세지 헤더
                final Map<String, String> headers = new HashMap<>();
                final File file = new File("C:\\Users\\user1\\Desktop\\dog.png");
                headers.put("Content-Type", "image/png; image/jpeg;");
                final long contentLength = file.length();
                headers.put("Content-Length", String.valueOf(contentLength));

                
                try {
                    final FileInputStream fis = new FileInputStream(file);
                    int readBytes;
                    final byte[] bytes = new byte[4096];
                    while ((readBytes = fis.read(bytes)) != -1) {
                        // bytes
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // 2.3. 메세지 바디

                final OutputStream out = socket.getOutputStream();
                // 1. 상태 라인 쓰기
                out.write(statusLine.getBytes(StandardCharsets.UTF_8));
                // 2. 응답 헤더 쓰기
                for (Map.Entry<String, String> e : headers.entrySet()) {
                    final String header =
                            String.format("%s: %s \r\n", e.getKey(), e.getValue());
                    out.write(header.getBytes(StandardCharsets.UTF_8));
                }
                // 3. 응답 바디
                out.write("\r\n".getBytes(StandardCharsets.UTF_8));
                
                try (final InputStream fis = new FileInputStream(file)) {
					int readBytes;
					final byte[] buf = new byte[4096];
					while((readBytes = fis.read(buf)) != -1) {
						out.write(buf);
					}
					out.flush();
					
				} catch (IOException e) {
					
				}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
