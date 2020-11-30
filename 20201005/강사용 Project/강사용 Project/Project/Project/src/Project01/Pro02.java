package Project01;

import java.util.Scanner;

/*2. 총합계를 구하시오.
 * 1번에서 작성한 소스코드를 적극 활용하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점) 
 * 출력 : 입력된 점수의 총 합계 출력
 * 학습정보 : 덧셈 연산자
 */
public class Pro02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//변수 지정
		String sinMinA, gongYu, parkBoGum;
		int aScore, bScore, cScore;
		
		//성적 합계 초기화
 		int sum=0;
	
		//학생 이름 입력
		System.out.print("학생 이름을 입력해주세요.>> ");
		sinMinA = scan.next();
		
		System.out.print("학생 이름을 입력해주세요.>> ");
		gongYu = scan.next();
		
		System.out.print("학생 이름을 입력해주세요.>> ");
		parkBoGum = scan.next();
		
		
		//학생 성적 입력
		System.out.print(sinMinA + "학생 성적을 입력해주세요.>> ");
		aScore = scan.nextInt();
		
		System.out.print(gongYu + "학생 성적을 입력해주세요.>> ");
		bScore = scan.nextInt();
		
		System.out.print(parkBoGum + "학생 성적을 입력해주세요.>> ");
		cScore = scan.nextInt();
		
		//성적합계
		sum = (aScore +  bScore + cScore);
		
		//입력된 점수의 총 합계 출력
		System.out.println(sinMinA+ ", " + gongYu+ ", " + parkBoGum+ ", 학생 성적 합계 : "  + sum + "점");
		
	}
}
