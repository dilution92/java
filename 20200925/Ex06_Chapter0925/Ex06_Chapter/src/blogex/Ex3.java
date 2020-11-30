package blogex;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [] num1 = new int[10];
		int [] num2 = new int[10];
		
		System.out.print(num1.length+"개의 "+"정수값을 입력하시오 : ");
		for(int i=0; i<num1.length;i++) {
			num1[i]=sc.nextInt();
			num2[num2.length-1-i] = num1[i];
		}
		for(int i=0; i<num1.length; i++) {
		System.out.print(num1[i]+"  ");
		}
		System.out.println();
		for(int i=0; i<num2.length; i++) {
			System.out.print(num2[i]+"  ");
		}
		sc.close();
	}
}
