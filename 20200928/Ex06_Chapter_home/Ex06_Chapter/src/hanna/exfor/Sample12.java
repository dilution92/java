package hanna.exfor;
import java.io.*;
public class Sample12 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("몇 번째에서 루프를 빠져 나가시겠습니까? (1 ? 10)");
		// for문에 switch을 사용해서 break를 만나면 오류가 잘난다.
		String str = br.readLine();
		int res = Integer.parseInt(str);

		for(int i=1; i<=10; i++) {
			System.out.println(i+"번째 처리입니다.");
			if(i==res) 
				break;
		}
		
		for(int i=1; i<=10; i++) {
			if (i ==res)
				continue;
			System.out.println(i+"번쨰 처리입니다.");
		}
	}
}
