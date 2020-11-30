package Project02;

import java.util.Scanner;

public class Grade {
	
	String name;
	int score;
	int i=0;
	
	void input() {
		Scanner scan = new Scanner(System.in);

		System.out.print((i+1) + "번 학생 이름을 입력해주세요. : ");
		name = scan.next();
		System.out.print((i+1) + "번 학생 점수를 입력해주세요. : ");
		score = scan.nextInt();
		output();
	}
	
	void output() {
		System.out.println((i+1) + "번 학생 이름 : " + name );
		System.out.println((i+1) + "번 학생 점수 : " + score + "점");
	}
	
}
