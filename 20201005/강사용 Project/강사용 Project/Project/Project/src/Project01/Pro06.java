package Project01;

import java.util.Scanner;

/*6. 입력한 점수가 짝수 인지 홀수 인지 판단하시오.
 * 1번에서 작성한 소스코드를 적극 활용하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점), 중복값은 없는 걸로 가정한다.
 * 출력 : 입력된 성적(점수)의 짝수/홀수 판단 유무 출력하기
 * 학습정보 : 단, 단독 if문 2개만 사용하여 출력하시오.
 */
//흰트 : == , != 
public class Pro06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//변수 지정
		String sinMinA, gongYu, parkBoGum;
		int aScore, bScore, cScore;

		//학생 이름 입력
		System.out.print("학생 이름을 입력해주세요.>> ");
		sinMinA = scan.next();

		//출력 : 입력된 성적(점수)의 짝수/홀수 판단 유무 출력하기
		System.out.print(sinMinA + "학생 성적을 입력해주세요.>> ");
		aScore = scan.nextInt();
		if(aScore % 2 == 0) {
			System.out.println("입력된 성적이 짝수입니다.");
		}else {
			System.out.println("입력된 성적이 홀수입니다.");
		}
		
		System.out.print("학생 이름을 입력해주세요.>> ");
		gongYu = scan.next();

		System.out.print(gongYu + "학생 성적을 입력해주세요.>> ");
		bScore = scan.nextInt();
		if(bScore % 2 == 0) {
			System.out.println("입력된 성적이 짝수입니다.");
		}else {
			System.out.println("입력된 성적이 홀수입니다.");
		}

		System.out.print("학생 이름을 입력해주세요.>> ");
		parkBoGum = scan.next();

		System.out.print(parkBoGum + "학생 성적을 입력해주세요.>> ");
		cScore = scan.nextInt();
		if(cScore % 2 == 0) {
			System.out.println("입력된 성적이 짝수입니다.");
		}else {
			System.out.println("입력된 성적이 홀수입니다.");
		}
	}
}
