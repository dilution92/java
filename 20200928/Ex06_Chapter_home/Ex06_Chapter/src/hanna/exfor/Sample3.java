package hanna.exfor;
import java.io.*;
public class Sample3 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("몇 개의 *을 출력 하시겠습니까?");
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		for (int i = 1; i <=num; i++) {
			System.out.println("*");
		}
				
		
		
	}

}
