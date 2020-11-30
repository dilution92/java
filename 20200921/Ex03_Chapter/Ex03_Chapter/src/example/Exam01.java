package example;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요: ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 정수를 입력하세요: ");
		int num2 = scan.nextInt();
		System.out.println("합 = " + (num1+num2));
		System.out.println("차 = " + (num1-num2));
		System.out.println("곱 = " + (num1*num2));
		
		scan.close();
	}

}