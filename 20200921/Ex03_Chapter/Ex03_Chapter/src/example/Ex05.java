package example;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ǽ� �� ���������� �Է��Ͻÿ�.");
		int score1 = scan.nextInt();
		System.out.println("�ǽ� ���������� �Է��Ͻÿ�.");
		int score2 = scan.nextInt();
		int totalscore = (score1/20 + score2/30)*30 + score1/25*40;
		
		System.out.println("�ǽ� �� �������� : "+ score1+ ",  �ǽ� �������� : "+ score2+ ",  ���� �ǽ����� : "+ totalscore);
		
		scan.close();
		
	}

}
