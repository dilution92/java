package Project02;

import java.util.Scanner;

public class Grade1 {
	Scanner sc = new Scanner(System.in); //static은 변수가 업데이트됨 마지막 변수로 고정;
	String name ; //학생 이름
	int score ; //학생 점수
	int i=0;
	
	void inputName() {
		System.out.println("학생이름을 입력하세요. : ");
		name =sc.next();
	}
	void inputScore() {
		System.out.println("학생점수를 입력하세요. : ");
		score = sc.nextInt();
		output();
	}
	void output() {
		System.out.println("학생이름 : "+name+", 점수 : "+score);
	}
			
	
}
