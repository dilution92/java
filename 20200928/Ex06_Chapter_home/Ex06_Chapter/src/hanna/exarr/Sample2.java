package hanna.exarr;
import java.io.*;
public class Sample2 {

	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� ������ ���� �Է� : ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int [] test = new int[num];
		
		for(int i=1; i<=num; i++) {
			System.out.print("������ �Է� : ");
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i-1] = tmp;
			
			System.out.println(i+"��° ����� ������ "+test[i-1]);
		}
	}
}
