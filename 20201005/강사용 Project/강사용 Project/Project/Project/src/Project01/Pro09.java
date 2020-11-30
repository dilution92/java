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
		Scanner scan = new Scanner(System.in);

		String[] name = new String[3]; //학생 이름
		int[] score = new int[3];//학생 점수

		int i=0; //초기화
		int sum=0;

		while(true) {
			for(i=0; i<name.length; i++) { 
				System.out.print((1+i)+ "번 학생 이름을 입력해주세요. : ");
				name[i] = scan.next();

				System.out.print((1+i) + "번 학생의 성적을 입력해주세요. : ");
				score[i] = scan.nextInt();
				sum = sum + score[i];
				if(sum >= 100) {
					System.out.println("성적의 합계가 100점이 넘습니다.");
					break;
				}
			}
			break;
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}

