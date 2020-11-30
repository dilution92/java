package example;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("밑변의 길이를 입력하세요. : ");
		int base = scan.nextInt();
		System.out.println("높이의 길이를 입력하세요. : ");
		int height = scan.nextInt();
		int area = base* height/2;
		
		System.out.println("직각삼각형의 면적은 : "+ area);
		
		scan.close();
	}

}
