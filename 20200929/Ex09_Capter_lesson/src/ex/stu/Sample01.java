package ex.stu;//학생 신상 정보 입출력프로그램 제작 (변수 이용)
import java.util.Scanner;
public class Sample01 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		String name1, name2, name3; //이름
		int age1, age2, age3; //나이
		String num1, num2, num3; //전화번호


		System.out.print("* 학생1 이름 입력 : ");
		name1 = in.next();
		System.out.print(name1+ "의 나이 입력 : ");
		age1 = in.nextInt();
		System.out.print(name1 + "의 전화번호 입력 : "); 
		num1 = in.next();// 학생 1정보 

		System.out.print("* 학생2 이름 입력 : ");
		name2 = in.next();
		System.out.print(name2+ "의 나이 입력 : ");
		age2 = in.nextInt();
		System.out.print(name2 + "의 전화번호 입력 : "); 
		num2 = in.next();// 학생 2 정보

		System.out.print("* 학생3 이름 입력 : ");
		name3 = in.next();
		System.out.print(name3+ "의 나이 입력 : ");
		age3 =in.nextInt();
		System.out.print(name3 + "의 전화번호 입력 : ");
		num3 = in.next();;// 학생 3 정보

		System.out.println("<학생 정보>");
		System.out.println("1. 이름 " + name1 + ", 나이 : " + age1 + ", 전화번호 : " + num1);
		System.out.println("2. 이름 " + name2 + ", 나이 : " + age2 + ", 전화번호 : " + num2);
		System.out.println("3. 이름 " + name3 + ", 나이 : " + age3 + ", 전화번호 : " + num3);

		for(;;) 
		{
			System.out.print("찾으시는 학생의 나이 : ");
			int a = in.nextInt();


			if (a==age1) {
				System.out.println("1. 이름 " + name1 + ", 나이 : " + age1 + ", 전화번호 : " + num1);
				System.out.println("프로그램을 종료합니다");
				break;
			}else if (a==age2) {
				System.out.println("2. 이름 " + name2 + ", 나이 : " + age2 + ", 전화번호 : " + num2);
				System.out.println("프로그램을 종료합니다");
				break;
			}else if (a==age3) {
				System.out.println("3. 이름 " + name3 + ", 나이 : " + age3 + ", 전화번호 : " + num3);
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("결과가 없습니다. 다시 입력해주세요 ");
			}
		}
	}
}