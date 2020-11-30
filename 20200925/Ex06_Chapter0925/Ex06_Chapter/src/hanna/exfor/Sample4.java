package hanna.exfor;
import java.io.*;
public class Sample4 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 시작 : ");
		String str1 = br.readLine();
		int num1 = Integer.parseInt(str1);
		
		
		System.out.println("숫자 몇까지의 합을 구하시겠습니까?");
		String str2 = br.readLine();
		int num2 = Integer.parseInt(str2);
		
		int sum = 0 ;
		for (int i = num1; i<=num2; i++) {
			sum += i;
		}
		System.out.println(num1+"부터"+num2+" 까지의 합은 "+sum+" 입니다.");
	}
}
