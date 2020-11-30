package example;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("500원짜리 동전들의 갯수 : ");
		int fh = scan.nextInt();
		System.out.println("100원짜리 동전들의 갯수 : ");
		int oh = scan.nextInt();
		System.out.println("50원짜리 동전들의 갯수 : ");
		int fifty = scan.nextInt();
		System.out.println("10원짜리 동전들의 갯수 : ");
		int ten = scan.nextInt();
		int total = fh*500 + oh*100 + fifty*50 + ten*10;
		
		System.out.println("총액은 : "+ total);
		
		scan.close();
		
	}

}
