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
		Scanner sc = new Scanner(System.in);
		Stu  s = new Stu();
		int total = 0;
		s.set();
		for(int i = 0; i<s.name.length; i++) {
			total = s.sco[i]+total;
		}
		s.print();
		System.out.println("총 점은 : "+ total);
		
		sc.close();
	}
}
