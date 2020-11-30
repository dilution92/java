package ex;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력");
		int num = sc.nextInt();
		
		for(int i=7; i<=num; i+=7) {
			if(num/7 == i/7	) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
