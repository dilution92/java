package hanna.exfor;
import java.io.*;
public class Sample12 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("�� ��°���� ������ ���� �����ðڽ��ϱ�? (1 ? 10)");
		// for���� switch�� ����ؼ� break�� ������ ������ �߳���.
		String str = br.readLine();
		int res = Integer.parseInt(str);

		for(int i=1; i<=10; i++) {
			System.out.println(i+"��° ó���Դϴ�.");
			if(i==res) 
				break;
		}
		
		for(int i=1; i<=10; i++) {
			if (i ==res)
				continue;
			System.out.println(i+"���� ó���Դϴ�.");
		}
	}
}
