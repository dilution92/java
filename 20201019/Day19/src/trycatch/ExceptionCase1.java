package trycatch;

import java.util.*;

public class ExceptionCase1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("a/b... a?");
			int n1 = sc.nextInt();
			System.out.printf("%d \n", n1);
		} catch (Exception e) {
			System.out.println("������ �߻��Ͽ����ϴ�.");
		}
		System.out.println("Good bye~~~!");
	}

}
