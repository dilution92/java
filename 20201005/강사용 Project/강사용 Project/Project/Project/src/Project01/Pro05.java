package Project01;

import java.util.Scanner;

/*5. max값을 찾아 출력하세요.
 * 1번에서 작성한 소스코드를 적극 활용하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점), 중복값은 없는 걸로 가정한다.
 * 출력 : 입력된 성적(점수)들 중 최대값을 출력하세요.
 * 학습정보 : 단, 단독 if문 2개만 사용하여 출력하시오(논리연산자(and, or)사용할 것)
 */
//흰트  a > b && a > c
public class Pro05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//변수 지정
		String sinMinA, gongYu, parkBoGum;
		int aScore, bScore, cScore;

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
		
		//최대값 출력(if문)
		int max = 0; //최대값을 담을 변수
		
		if(aScore > bScore) {
			max = aScore;
		}else {
			max = bScore;
		}
		
		if(max < cScore) {
			max = cScore;
		}
		
		//출력
		System.out.println("최대성적값 : " + max + "점");
	}
}
