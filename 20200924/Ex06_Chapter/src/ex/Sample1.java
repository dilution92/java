package ex;
import java.io.*;
public class Sample1 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���ڸ� �Է�");
		System.out.println("���ڸ� �Է�");
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		int num = Integer.parseInt(str2);
		
		for(int i =1; i<=num; i++) {
			System.out.print(str1);
		}
	}
}
