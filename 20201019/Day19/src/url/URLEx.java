package url;

import java.net.URL;
import java.net.*;
import java.util.*;

public class URLEx {
	public static void main(String[] args) {
		URLEx u = new URLEx();
		u.testURLEx("https://www.naver.com");
	}
	
	public void testURLEx(String urlStr) { 
		System.out.println(urlStr);
		
		URL url;
		
		try {
			url = new URL(urlStr);
			System.out.println("�������� : "+ url.getProtocol());
			System.out.println("��Ʈ��ȣ : "+ url.getPort());
			System.out.println("ȣ��Ʈ : "+ url.getHost());
			System.out.println("���ϰ�� : "+ url.getFile());
			System.out.println("URL ��ü : "+ url.toExternalForm());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
