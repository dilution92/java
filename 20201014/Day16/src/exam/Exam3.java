package exam;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[3];
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("정수를 입력하세요.");
			a[i] = sc.nextInt();
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		sc.close();
	}
}
