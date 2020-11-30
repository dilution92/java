package ex.stu; //학생 신상 정보 입출력 프로그램(1차원 배열사용, 정렬과 탐색추가 )
import java.util.Scanner;
public class Sample04 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		String[] name = new String[6]; //이름
		int[] age = new int[3]; //나이
		String[] num = new String[11]; //전화번호


		for (int i = 0; i < 3; i++) {
			System.out.print("* 학생" + (i+1) +"의 이름 입력 : ");
			name[i] = in.next();

			System.out.print(name[i]+ "의 나이를 입력 : ");
			age[i] = in.nextInt();	

			System.out.print(name[i] +"의 전화번호를 입력 : ");
			num[i] = in.next();
		}//for

		System.out.println("<학생 정보>");
		
		for (int s = 0; s < 2; s++) {
			for (int t = s+1; t < 3; t++) {
				if (age[t] > age[s]) {
					int tmp = age[t];
					age[t] = age[s];
					age[s] = tmp;//나이 많은 순서대로
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.print((i+1) + ". 이름 :" + name[i] + " ");
			System.out.print(", 나이 :" + age[i] +" ");
			System.out.print(", 전화번호 : " + num[i]+ "\n"); //학생정보 출력
		}//for
		
		for(;;) 
		{
		System.out.print("찾으시는 학생의 나이 : ");
		int a = in.nextInt();
		
		for (int i = 0; i < 3; i++) {
			if (a == age[i]) {
				System.out.println("이름 : " + name [i] +", 나이 : "+ age[i]+ ", 전화번호 : " + num[i]);	
				System.out.println("프로그램을 종료합니다");
				return;//두 학생의 나이가 중복되었을 경우, 두 학생을 같이 출력하고싶은데 맨처음학생만 출력되고 멈춤
			}
			}//for
			System.out.println("결과가 없습니다. 다시 입력해주세요");	
		} 
	}
}