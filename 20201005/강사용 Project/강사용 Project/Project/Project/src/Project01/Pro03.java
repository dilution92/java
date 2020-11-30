package Project01;

import java.util.Scanner;

/*3. max값과 min값을 찾아 출력하세요.
 * 1번에서 작성한 소스코드를 적극 활용하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점), 중복값은 없는 걸로 가정한다.
 * 출력 : 입력된 성적(점수)들 중 최대값과, 최소값을 출력하세요.
 * 학습정보 : 삼항연산자(if문은 사용하지 마세요)
 */

//최대값, 최소값 삼항연산자
//흰트 : int max = aScore > bScore ? aScore : bScore;
public class Pro03 {

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

		//최대값, 최소값 삼항연산자
		int max = aScore > bScore ? aScore : bScore;
		max = max > cScore ? max : cScore;

		int min = aScore > bScore ? bScore : aScore;
		min = min > cScore ? cScore : min;

		//min 방법2
		//int min = aScore < bScore ? aScore : bScore;
		//min = min < cScore ? min : cScore;
		//최대값, 최소값 출력
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}
