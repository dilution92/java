package example;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ ����(1000�� ����)�� �Է��ϼ���. : ");
		int itemprice = scan.nextInt();
		System.out.println("������ ������ "+itemprice+"�� �Դϴ�.");
		int change = 1000 - itemprice;
		System.out.println("�Ž������� "+change+"�� �Դϴ�.");
		int fh = change/500;
		int oh = (change-fh*500)/100;
		int fifty = (change-fh*500-oh*100)/50;
		int ten = (change-fh*500-oh*100-fifty*50)/10;
		int five = (change-fh*500-oh*100-fifty*50-ten*10)/5;
		int one = (change-fh*500-oh*100-fifty*50-ten*10-five*5);
		/*
		 * int fh = change/500
		 * change = change % 500
		 * int oh = change/100
		 * chnage = change % 100
		 * int fifty = change /50
		 * change = change % 50
		 * int ten = change /10
		 * chagne = ten %10
		 * int five = change /5
		 * int one = five % 5
		 */
		System.out.println("500���� "+fh+"�� �Դϴ�." );
		System.out.println("100���� "+oh+"�� �Դϴ�." );
		System.out.println("50���� "+fifty+"�� �Դϴ�." );
		System.out.println("10���� "+ten+"�� �Դϴ�." );
		System.out.println("5���� "+five+"�� �Դϴ�." );
		System.out.println("1���� "+one+"�� �Դϴ�." );

		scan.close();
	}

}
