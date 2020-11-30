package exam;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("학생의 점수를 입력하세요.");
		num = sc.nextInt();
		
		if(num/10 == 10	) {
			System.out.println("A+");
		}else if(num/10 == 9) {
			System.out.println("A");
		}else if(num/10 == 8) {
			System.out.println("B+");
		}else if(num/10 == 7) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		sc.close();
	}

}
