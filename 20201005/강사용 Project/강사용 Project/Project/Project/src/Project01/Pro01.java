package Project01;

import java.util.Scanner;

/*1. 3명의 학생정보 입출력 시스템을 완성하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점) 
 * 출력 : 입력된 정보 출력 
 * 학습정보 : 대입연산자, 변수, 출력
 */
public class Pro01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//변수 지정
		String sinMinA, gongYu, parkBoGum;
		int aScore, bScore, cScore;
	
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
		
		//학생 정보 출력
		System.out.println("학생 이름 : " + sinMinA + "성적 : " + aScore + "점");
		System.out.println("학생 이름 : " + gongYu + "성적 : " + bScore + "점");
		System.out.println("학생 이름 : " + parkBoGum + "성적 : " + cScore +"점");
		
	}
}