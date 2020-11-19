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
            // ���� ���� ����
            final ServerSocket serverSocket = new ServerSocket(12345);
            // �ܺ��� ������ ���
            System.out.println("���� ��� ��");
            final Socket socket = serverSocket.accept();
            System.out.println("���� ��");
            // 1. ������ Ŭ���̾�Ʈ���� �޼����� �ϳ� ����
            recvMessage(socket.getInputStream());
            
            // 2. ������ Ŭ���̾�Ʈ���� �޼����� ����
            sendMessage(socket.getOutputStream());

//          socket.getInputStream();	// from client(Ŭ���̾�Ʈ���� ���� ������)
//			socket.getOutputStream();   // to client(Ŭ���̾�Ʈ�� ������ ������)
			
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
