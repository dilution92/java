package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
    	
    	
        try {
            // 서버 소켓 생성
            final ServerSocket serverSocket = new ServerSocket(12345);
            // 외부의 접속을 대기
            System.out.println("접속 대기 중");
            final Socket socket = serverSocket.accept();
            System.out.println("접속 됨");
            // 1. 접속한 클라이언트에게 메세지를 하나 받음
            recvMessage(socket.getInputStream());
            
            // 2. 접속한 클라이언트에게 메세지를 보냄
            sendMessage(socket.getOutputStream());

//          socket.getInputStream();	// from client(클라이언트에서 오는 데이터)
//			socket.getOutputStream();   // to client(클라이언트로 보내는 데이터)
			
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void recvMessage(InputStream is) throws IOException {
        final byte[] buffer = new byte[4096];
        int readBytes;

        while ((readBytes = is.read(buffer)) != -1) {
            final String messageFromClient = new String(buffer);
            System.out.println(messageFromClient);
        }
    }


	    private static void sendMessage(OutputStream os) {
	    	Scanner sc = new Scanner(System.in);
	        final String messageToClient = sc.next();
	        System.out.println("Server>>");
	    }
	}
