package example;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("500��¥�� �������� ���� : ");
		int fh = scan.nextInt();
		System.out.println("100��¥�� �������� ���� : ");
		int oh = scan.nextInt();
		System.out.println("50��¥�� �������� ���� : ");
		int fifty = scan.nextInt();
		System.out.println("10��¥�� �������� ���� : ");
		int ten = scan.nextInt();
		int total = fh*500 + oh*100 + fifty*50 + ten*10;
		
		System.out.println("�Ѿ��� : "+ total);
		
		scan.close();
		
	}

}
