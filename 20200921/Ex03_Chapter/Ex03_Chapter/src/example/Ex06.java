package example;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�غ��� ���̸� �Է��ϼ���. : ");
		int base = scan.nextInt();
		System.out.println("������ ���̸� �Է��ϼ���. : ");
		int height = scan.nextInt();
		int area = base* height/2;
		
		System.out.println("�����ﰢ���� ������ : "+ area);
		
		scan.close();
	}

}
