package Project01;

import java.util.Scanner;

/*7. 학점 계산 프로그램을 작성하시오.
 * 1번에서 작성한 소스코드를 적극 활용하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점), 중복값은 없는 걸로 가정한다.
 * 출력 : 입력된 성적(점수)가 90점 이상이면 A학점, 
 * 89~80점이면 B학점, 79점 이하면 F학점으로 출력
 * 학습정보 : 단, 단독 if~else if문 사용하세요.
 */
public class Pro07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//변수 지정
		String sinMinA, gongYu, parkBoGum;
		int aScore, bScore, cScore;

		//학생 이름 입력
		System.out.print("학생 이름을 입력해주세요.>> ");
		sinMinA = scan.next();

		//입력된 성적(점수)가 90점 이상이면 A학점, 89~80점이면 B학점, 79점 이하면 F학점으로 출력

		System.out.print(sinMinA + "학생 성적을 입력해주세요.>> ");
		aScore = scan.nextInt();

		if(aScore >= 90) {
			System.out.println("A학점");
		}else if (aScore >= 80) {
			System.out.println("B학점");
		}else {
			System.out.println("F학점");
		}
		System.out.print("학생 이름을 입력해주세요.>> ");
		gongYu = scan.next();

		System.out.print(gongYu + "학생 성적을 입력해주세요.>> ");
		bScore = scan.nextInt();

		if(bScore >= 90) {
			System.out.println("A학점");
		}else if (bScore >= 80) {
			System.out.println("B학점");
		}else {
			System.out.println("F학점");
		}

		System.out.print("학생 이름을 입력해주세요.>> ");
		parkBoGum = scan.next();
		System.out.print(parkBoGum + "학생 성적을 입력해주세요.>> ");
		cScore = scan.nextInt();

		if(cScore >= 90) {
			System.out.println("A학점");
		}else if (cScore >= 80) {
			System.out.println("B학점");
		}else {
			System.out.println("F학점");
		}

	}

}
