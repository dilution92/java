package hanna.exarr;
import java.io.*;
public class pro {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 3;
		String [] name = new String[num];
		String [] age = new String[num];
		String [] call = new String[num];
		
		for(int i=1; i<=num; i++) {
			System.out.println("학생 정보를 입력하세요 (이름 나이 전화번호)");
			name[i-1] = br.readLine();
			age[i-1] = br.readLine();
			call[i-1] = br.readLine();
		}
		System.out.println(" 학 생 정 보 명 단");
		System.out.println("--------------------------------------");
		for(int i=1; i<=num; i++) {
			System.out.println(name[i-1]+"  "+age[i-1]+"  "+call[i-1]);
		}
		System.out.println("--------------------------------------");

		for(int i=1; i<=num; i++) {
			System.out.println("학생 나이를 입력해주세요.(종료는 n) : ");
			String res1 = br.readLine();
			

			if(res1.equals(age[i-1])) {
				System.out.println(name[i-1]+"  "+age[i-1]+"  "+call[i-1]);
				i--;
			}
			else if(res1 == "n") {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("검색결과 없음");
				i--;
			}
		}
	}
}
