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
		Scanner sc = new Scanner(System.in);
		Stu  s = new Stu();
		int max=0, min=100;
		s.set();
		
		max = s.sco[0]>s.sco[1] ? s.sco[0] : s.sco[1];
		max = max>s.sco[2] ? max : s.sco[2];

		min = s.sco[0]<s.sco[1] ? s.sco[0] : s.sco[1];
		min = min<s.sco[2] ? min : s.sco[2];
//		
//		for(int i = 0; i<s.name.length; i++) {
//			if(max<s.sco[i]) {
//				max=s.sco[i];
//			}
//			if(min<s.sco[i]) {
//				min=s.sco[i];
//			}
//		}
		System.out.println("최대값은 "+max+", 최소값은 "+min);
		sc.close();
	}
}
