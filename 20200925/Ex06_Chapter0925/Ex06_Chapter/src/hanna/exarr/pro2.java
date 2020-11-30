package hanna.exarr;
import java.io.*;
public class pro2 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 3;
		int select=0;
		String [] name = new String[num];
		String [] age = new String[num];
		String [] call = new String[num];
		
		while(select != 4) {
			System.out.println("-----메뉴-----");
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 프로그램 종료");
			System.out.println("-------------");
			String res = br.readLine();
			select = Integer.parseInt(res);

			switch (select){

			case 1 :
				for(int i=1; i<=num; i++) {
					System.out.println("학생 정보를 입력하세요 (이름 나이 전화번호)");
					name[i-1] = br.readLine();
					age[i-1] = br.readLine();
					call[i-1] = br.readLine();
					System.out.println("입력 완료!");
					System.out.println("");
				} break;

			case 2 :
				System.out.println(" 학 생 정 보 명 단");
				System.out.println("--------------------------------------");
				for(int i=1; i<=num; i++) {
					System.out.println(name[i-1]+"  "+age[i-1]+"  "+call[i-1]);
				}
				System.out.println("--------------------------------------");
				break;

			case 3 :
				System.out.println("학생 나이를 입력해주세요.(종료는 n) : ");
				String res1 = br.readLine();
				
				for(int i=1; i<=num; i++) {
					
					if(res1.equals(age[i-1])) {
						System.out.println(name[i-1]+"  "+age[i-1]+"  "+call[i-1]);
						continue;
					}
					else if(res1.equals("n")) {
						System.out.println("검색을 종료합니다.");
						break;
					}
				} break;
				
			case 4 : 
				System.out.println("프로그램을 종료합니다.");
				break;
				
				default :
				System.out.println("다시 입력해 주세요.");
			}
		}
	}
}
