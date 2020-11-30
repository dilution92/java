
import java.util.Scanner;

public class Sample11 {

	public static void main(String[] args) {

		int num1, num2;
		int kor1, kor2;
		int math1, math2;
		int eng1, eng2;
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("학생번호 입력 >> ");
		num1 = scan.nextInt();
		System.out.print("국어점수 입력 >> ");
		kor1 = scan.nextInt();
		System.out.print("수학점수 입력 >> ");
		math1 = scan.nextInt();
		System.out.print("영어점수 입력 >> ");
		eng1 = scan.nextInt();
		
		System.out.println("학생번호 "+num1+" 완료!!");
		System.out.println("다음 학생 번호 입력");
		System.out.print("학생번호 입력 >> ");
		num2 = scan.nextInt();
		System.out.print("국어점수 입력 >> ");
		kor2 = scan.nextInt();
		System.out.print("수학점수 입력 >> ");
		math2 = scan.nextInt();
		System.out.print("영어점수 입력 >> ");
		eng2 = scan.nextInt();
		
		int sum2= (kor2+math2+eng2);
		
		System.out.println("                     ");
		System.out.println("                     ");
		
		System.out.println("─────────────────────");
		System.out.println("학생번호 : "+ num1);
		System.out.println("국어점수 : "+ kor1);
		System.out.println("수학점수 : "+ math1);
		System.out.println("영어점수 : "+ eng1);
		System.out.println("총 점수 : "+ (kor1+math1+eng1));
		System.out.println("평균점수 : "+ (kor1+math1+eng1)/3);
		System.out.println("─────────────────────");
		
		System.out.println("                     ");
		System.out.println("                     ");
		
		System.out.println("─────────────────────");
		System.out.println("학생번호 : "+ num2);
		System.out.println("국어점수 : "+ kor2);
		System.out.println("수학점수 : "+ math2);
		System.out.println("영어점수 : "+ eng2);
		System.out.println("총 점수 : "+ sum2);
		System.out.println("평균점수 : "+ sum2/3);
		System.out.println("─────────────────────");

		
	}

}
