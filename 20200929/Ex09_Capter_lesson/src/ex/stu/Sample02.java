package ex.stu; //학생 신상 정보 입출력 프로그램(1차원 배열사용)
import java.util.Scanner;
public class Sample02 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		String[] name = new String[6]; //이름
		int[] age = new int[3];//나이
		int[] num = new int[11];//전화번호


		for (int i = 0; i < 3; i++) {
			System.out.print("* 학생" + (i+1) +"의 이름 입력 : ");
			name[i] = in.next();

			System.out.print(name[i]+ "의 나이를 입력 : ");
			age[i] = in.nextInt();

			System.out.print(name[i] +"의 전화번호를 입력 : ");
			num[i] = in.nextInt();	//0이 안먹힘 
		}//for

		System.out.println("<학생 정보>");

		for (int i = 0; i < 3; i++) {
			System.out.print((i+1) + ". 이름 :" + name[i] + " ");
			System.out.print(", 나이 :" + age[i] +" ");
			System.out.print(", 전화번호 : " + num[i]+ "\n"); //학생정보 출력
		}//for


	}
}