package chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattingServer implements Runnable {
	Socket sk;
	public ChattingServer() {
		System.out.println("Server starting~~~");
		try {
			ServerSocket ssk = new ServerSocket(6060);
			//클라이언트와 통신하는 소켓
			
			sk = ssk.accept();
			System.out.println("클라이언트와 연결되었습니다...!!!");
		
			//클라이언트에게 데이타를 보내기 위한 스트림 생성
			InputStreamReader inR = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(inR);
			
			//클라이언트에게 메세지를 보내기위한 스트림 생성
			PrintWriter pout = new PrintWriter(sk.getOutputStream(),true);
			
			Thread thr = new Thread(this);
			thr.start();
			
			String msg = "";
			while((msg = br.readLine()) !=null) {
				pout.println(msg);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}//생성자
	
	public void run() {
		InputStream ins;
		try {
			ins = sk.getInputStream();
			InputStreamReader ir = new InputStreamReader(ins);
			BufferedReader buR = new BufferedReader(ir);
			String clientMsg = "";
			while(true) {
				clientMsg = buR.readLine();
				System.out.println("Client > "+ clientMsg);
			}
		} catch(IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ChattingServer();
	}
}
