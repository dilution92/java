package hanna.exarr;
import java.io.*;
public class Sample2 {

	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시험 응시자 수를 입력 : ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int [] test = new int[num];
		
		for(int i=1; i<=num; i++) {
			System.out.print("점수를 입력 : ");
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i-1] = tmp;
			
			System.out.println(i+"번째 사람의 점수는 "+test[i-1]);
		}
	}
}
