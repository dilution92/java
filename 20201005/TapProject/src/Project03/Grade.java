package Project03;
import java.util.Scanner;
public class Grade {
	Scanner sc = new Scanner(System.in);
	String name;
	int score;
	
	public Grade() {
		System.out.println("Grade 생성자 생성");
	}
	

	void input() {
		System.out.println("학생이름을 입력하세요. : ");
		name =sc.next();
		System.out.println("학생점수를 입력하세요. : ");
		score = sc.nextInt();
	}
}
