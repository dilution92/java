package example;
import java.util.Scanner; 

public class Exam02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("영작문 과목의 점수 : ");
		int eng = scan.nextInt();
		System.out.print("프로그래밍 과목의 점수 : ");
		int pro = scan.nextInt();
		System.out.print("이산수학 과목의 점수 : ");
		int mat = scan.nextInt();
		System.out.print("컴퓨터구조 과목의 점수 : ");
		int com = scan.nextInt();
		System.out.print("평균 점수 :" + (eng+pro+mat+com)/4.0);

		scan.close();
	}

}
