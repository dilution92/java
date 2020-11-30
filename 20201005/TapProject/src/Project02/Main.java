package Project02;

import java.util.Scanner;

//11. 프로젝트 10번을 기준으로 만드시오.
//프로젝트 10번을 Grade 클래스로 생성한 후 실행하세요.
//생성 클래스 : Grade, Main

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Grade1 grade = new Grade1();
		grade.inputName();
		grade.inputScore();
		grade.output();

		sc.close();
	}
}
