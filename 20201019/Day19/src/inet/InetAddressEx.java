package inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	//192.168.40.12
	InetAddress ip = null;
	String ip1 = null;

	
	public InetAddressEx() throws Exception {
		testInetAddress();
	}
	
	public void testInetAddress() throws Exception {
		ip = InetAddress.getLocalHost();
		System.out.println(ip);  // ���� ȣ��Ʈ �ּ� ���
		ip1 = ip.getHostAddress();
		System.out.println(ip1); // ȣƮ �ּ� ���
		
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		System.out.println(ip.toString());
		System.out.println("----------------------");
	}
	
	
	@Override
	public String toString() {
		return "������ �ּ� Ȯ���ϴ� �� .....";
				//"InetAddressEx [ip=" + ip + ", ip1=" + ip1 + "]";
	}


	public static void  main(String[]args) throws Exception {
		new InetAddressEx();
	}
}
