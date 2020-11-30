package exam;

import java.util.Scanner;

public class Ex6_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("학생의 점수를 입력하세요.");
		num = sc.nextInt();

		switch(num/10){

		case(10) : System.out.println("A+");
		break;
		case(9) : System.out.println("A");
		break;
		case(8) : System.out.println("B+");
		break;
		case(7) : System.out.println("B");
		break;
		case(6) : System.out.println("C+");
		break;
		case(5) : System.out.println("C");
		break;
		default : System.out.println("D");
		break;
		}
		sc.close();
	}
}
