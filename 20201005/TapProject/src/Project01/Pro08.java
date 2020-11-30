package Project01;

import java.util.Scanner;

/*8. 1차원 배열을 활용한 성적 출력 프로그램 작성하기
 * 1번에서 작성한 소스코드를 1차원 배열 형태로 변경하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점), 중복값은 없는 걸로 가정한다.
 * 출력 : 입력된 성적(점수)을 for문을 사용하여 출력하시오.
 * 학습정보 : 1차원 배열 사용하기
 */
public class Pro08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stu  s = new Stu();
		s.set();
		s.print();
		sc.close();
	}

}
