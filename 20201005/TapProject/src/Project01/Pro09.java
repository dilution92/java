package Project01;

import java.util.Scanner;

/*9. while문 사용하기(학생 점수의 합계가 100점 이상이면 반복문 빠져나오기)
 * 8번에서 작성한 소스코드를 활용하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점), 입력된 점수는 50점 이상으로 가정한다.
 * 출력 : 입력된 성적(점수)의 총 합계가 100점 이상이면 반복문을 빠져나온다.
 * 마지막 "프로그램이 종료되었다"는 안내메시지를 띄운다.
 * 학습정보 : break 사용하기
 */
public class Pro09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stu  s = new Stu();
		int total = 0, i =0;
		while(total < 100) {
			System.out.println("총점은 : "+total);
			System.out.println("학생성적을 입력하세요. ");
			s.sco[i]=sc.nextInt();
			total = s.sco[i]+total;
			i++;
		}
		System.out.println("총점은 : "+ total);
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}

