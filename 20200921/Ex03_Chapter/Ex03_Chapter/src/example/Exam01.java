package example;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù ��° ������ �Է��ϼ���: ");
		int num1 = scan.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ���: ");
		int num2 = scan.nextInt();
		System.out.println("�� = " + (num1+num2));
		System.out.println("�� = " + (num1-num2));
		System.out.println("�� = " + (num1*num2));
		
		scan.close();
	}

}