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
		Scanner sc = new Scanner(System.in);
		Stu  s = new Stu();
		s.set();
		int max=s.sco[2];

		if(s.sco[0]>s.sco[1] && s.sco[0]>s.sco[2]) {
			max=s.sco[0];
		}
		if(s.sco[1]>s.sco[0] && s.sco[1]>s.sco[2]) {
			max=s.sco[1];
		}

		System.out.println(max);
		sc.close();
	}
}
