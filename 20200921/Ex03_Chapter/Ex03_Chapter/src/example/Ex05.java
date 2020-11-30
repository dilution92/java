package example;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("실습 전 과제점수를 입력하시오.");
		int score1 = scan.nextInt();
		System.out.println("실습 과제점수를 입력하시오.");
		int score2 = scan.nextInt();
		int totalscore = (score1/20 + score2/30)*30 + score1/25*40;
		
		System.out.println("실습 전 과제점수 : "+ score1+ ",  실습 과제점수 : "+ score2+ ",  최종 실습점수 : "+ totalscore);
		
		scan.close();
		
	}

}
