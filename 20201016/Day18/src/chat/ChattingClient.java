package chat;

import java.io.*;
import java.net.Socket;

public class ChattingClient implements Runnable	{
	String ip = "127.0.0.1";
	int port = 6060;
	Socket sk;
	String sendMsg;
	public ChattingClient() {
		
		try {
			sk = new Socket(ip,port);
			System.out.println("채팅서버와 연결되었습니다....");
			//서버로 보낼 메세지를 키보드로 입력받는 스트림 생성
			InputStreamReader inR = new InputStreamReader(System.in);
			BufferedReader buR = new BufferedReader(inR);
			
			PrintWriter pout = new PrintWriter(sk.getOutputStream(), true);
			
			Thread thr = new Thread(this);
			thr.start();
			sendMsg = "";
			while((sendMsg = buR.readLine())!=null) {
				pout.println(sendMsg);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
		try {
			InputStream ins = sk.getInputStream();
			BufferedReader buR = new BufferedReader(new InputStreamReader(ins));
			String svrMsg = "";
			while(true) {
				svrMsg = buR.readLine();
				System.out.println(" Server > "+svrMsg);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ChattingClient();
	}
}
