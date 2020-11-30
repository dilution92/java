package example;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("물건의 가격(1000원 이하)을 입력하세요. : ");
		int itemprice = scan.nextInt();
		System.out.println("물건의 가격은 "+itemprice+"원 입니다.");
		int change = 1000 - itemprice;
		System.out.println("거스름돈은 "+change+"원 입니다.");
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
		System.out.println("500원은 "+fh+"개 입니다." );
		System.out.println("100원은 "+oh+"개 입니다." );
		System.out.println("50원은 "+fifty+"개 입니다." );
		System.out.println("10원은 "+ten+"개 입니다." );
		System.out.println("5원은 "+five+"개 입니다." );
		System.out.println("1원은 "+one+"개 입니다." );

		scan.close();
	}

}
