package example;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ������ �Է��Ͻÿ�. : ");
		double area1 = scan.nextInt();
		double area2 = area1*3.3;
		
		System.out.println(area1+ "���� "+area2+"���������̴�.");
		
		scan.close();
	}

}
