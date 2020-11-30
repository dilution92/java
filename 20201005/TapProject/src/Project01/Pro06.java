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
		Scanner sc = new Scanner(System.in);
		Stu  s = new Stu();
		s.set();
		String [] str = new String[3];
		str[0] = s.sco[0]%2 == 0 ? "짝수" : "홀수";
		str[1] = s.sco[1]%2 == 0 ? "짝수" : "홀수";
		str[2] = s.sco[2]%2 == 0 ? "짝수" : "홀수";

		for(int i = 0; i<s.name.length; i++) {
		System.out.println(s.name[i]+"는 "+str[i]);
		}
		sc.close();
	}
}
