package test.tcp;
import java.io.*;
import java.net.*;

public class TCPEchoServer {
	public void tcpServer(int port) {
		//���� ���� ���� ��ü
		ServerSocket serverSock =null;
		Socket sock = null;
		InetAddress inetAddr = null;
		
		//����� ��ü
		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		PrintWriter wr = null;
		
		try {
			//���� ���� ����
			serverSock = new ServerSocket(port);
			
			while(true) {
				//Ŭ���̾�Ʈ�� ���� ���
				System.out.println("========= Ŭ���̾�Ʈ ���� ��� �� "+ "(port"+ serverSock.getLocalPort()+")====");
				sock = serverSock.accept();
				
				//Ŭ���̾�Ʈ ���� ��û
				inetAddr = serverSock.getInetAddress();
				System.out.println("Ŭ���̾�Ʈ("+ inetAddr.getHostAddress() + ")����");
				
				//Ŭ���̾�Ʈ�� ����� ���� stream ����
				
				in = sock.getInputStream();
				out = sock.getOutputStream();
				br = new BufferedReader(new InputStreamReader(in));
				wr = new PrintWriter(new OutputStreamWriter(out));
				String msg = null;
				
				//Ŭ���̾�Ʈ�� ���
				while((msg = br.readLine())!= null) {
					System.out.println("\tCLIENT > "+msg);
					wr.println(msg);
					wr.flush();
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				br.close();
				wr.close();
				in.close();
				out.close();
				sock.close();
				serverSock.close();
				System.out.println("����");
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
