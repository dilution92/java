package test.inet;
import java.net.InetAddress;

import java.util.Arrays;


public class InetAddressEx {
	public void testInetAddress(String domain) {
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getByName(domain);
			
			System.out.println("Host Name : "+ ip.getHostName());
			System.out.println("Host Address : "+ ip.getHostAddress());
			System.out.println("Host Name/Host Address : \n\t"+ ip.toString());
			
			System.out.println("--------------------");
			byte[] ipAddr = ip.getAddress();
			System.out.println("getAddress() : "+ Arrays.toString(ipAddr));
			
			System.out.println("Host Address : ");
			for(int i=0; i<ipAddr.length; i++) {
				if(ipAddr[i] < 0) {
					System.out.print(ipAddr[i]+256);
				}else {
					System.out.print(ipAddr[i]);
				}
				System.out.print(".");
			}
			System.out.println("");
			
			System.out.println("--------------------");
			ip = InetAddress.getLocalHost();
			System.out.println("Local Host Name : "+ ip.getHostName());
			System.out.println("Local Host Address : "+ ip.getHostAddress());
			System.out.println("Local Host Name/Local Host Address : "+ip.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
}
