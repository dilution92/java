package Project01;

import java.util.Scanner;

/*4. 평균을 구하시오.
 * 1번에서 작성한 소스코드를 적극 활용하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점), 중복값은 없는것으로 가정한다. 
 * 출력 : 입력된 점수 중 최대값을 제외하세요. 
 * 그 다음 나머지 2명의 점수의 평균을 구하여 출력하시오.
 * 학습정보 : 형변환 반드시 사용할 것!
 */
public class Pro04 {

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


		// 평균 구하기
		double avg = ((double)(aScore + bScore + cScore - max) / 2);
		
		//출력
		System.out.println("최대값을 제외한 평균 : " + avg + "점");

	}

}
