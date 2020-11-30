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
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3]; //학생 이름
		int[] score = new int[3];//학생 점수

		int i=0; //초기화
		
		for(i=0; i<name.length; i++) { 
			System.out.print((1+i)+ "번 학생 이름을 입력해주세요. : ");
			name[i] = scan.next();
			
			System.out.print((1+i) + "번 학생의 성적을 입력해주세요. : ");
			score[i] = scan.nextInt();
			if(score[i] > 100) {
				System.out.print("실패했습니다. 다시 입력해주세요 : ");
				score[i] = scan.nextInt();
			}
		}//학생 정보 입력

		
		for(i=0; i<name.length; i++) { 
			System.out.println("\n" + (1+i) + "번 학생 정보 출력");
			System.out.println((1+i) + "번 학생이름 : " + name[i]);
			System.out.println((1+i) + "번 학생성적 : " + score[i] + "점");
		}//학생 정보 출력
	}

}
