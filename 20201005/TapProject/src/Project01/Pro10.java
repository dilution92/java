package Project01;

import java.util.Scanner;

/*10. static 멤버필드, static 메소드 활용하여 프로그램 작성하기
 * 8번에서 작성한 소스코드를 활용하세요.
 * 멤버필드 : 학생 이름과 성적(100점 만점)입력 시킬 배열
 * 메소드 : input(), output() 
 * 메소드 input()의 경우 Scanner를 사용하여 사용자로부터 한꺼번에 입력받도록한다.
 * 메소드 output()의 경우 input()이 실행된 후 output() 출력이 실행되도록 한다.
 * 마지막 "프로그램이 종료되었다"는 안내메시지를 띄운다.
 * 학습정보 : static
 */

public class Pro10 {
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
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pro10 [] p = new Pro10[3];
		
		for(int i = 0; i<p.length; i++) {
			p[i] = new Pro10();
			p[i].inputName();
			p[i].inputScore();
		}
		System.out.println("프로그램이 종료되었다.");
		sc.close();
	}
}
