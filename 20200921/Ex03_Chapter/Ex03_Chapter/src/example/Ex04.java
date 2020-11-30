package example;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 평인지 입력하시오. : ");
		double area1 = scan.nextInt();
		double area2 = area1*3.3;
		
		System.out.println(area1+ "평은 "+area2+"제곱미터이다.");
		
		scan.close();
	}

}
