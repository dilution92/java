package test.url;

import java.net.*;
import java.util.*;

public class URLEx {
	public void testURLExample(String urlStr) {
		System.out.println(urlStr);
		
		URL url;
		try {
			url = new URL(urlStr);
			System.out.println("�������� : "+url.getProtocol());
			System.out.println("��Ʈ��ȣ : "+ url.getPort());
			System.out.println("ȣ��Ʈ : "+ url.getHost());
			System.out.println("���ϰ�� : "+ url.getFile());
			System.out.println("URL ��ü : "+ url.toExternalForm());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
