
import java.util.Scanner;

public class Sample11_1 {

	public static void main(String[] args) {

		int num;
		int soc;
		int sum1;
		int sum2;
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("학생번호 입력 >> ");
		soc = scan.nextInt();//1
		sum2 = soc
		System.out.print("1. 국어점수 입력 >> ");
		soc = scan.nextInt();//50
		sum1 = soc;
		System.out.print("1. 수학점수 입력 >> ");
		soc = scan.nextInt();//90
		sum1 = sum1 + soc;
		System.out.print("1. 영어점수 입력 >> ");
		soc = scan.nextInt();//80
		sum1 = sum1 + soc;
		
		System.out.println(sum2 + " 번호 학생의 점수 합계" + sum1);

		System.out.print("학생번호 입력 >> ");
		soc = scan.nextInt();
		soc = sum2;
		sum1 = 
		System.out.print("2. 국어점수 입력 >> ");
		soc = scan.nextInt();
		sum2 = soc;
		System.out.print("2. 수학점수 입력 >> ");
		soc = scan.nextInt();
		sum2 = sum2 + soc;
		System.out.print("2. 영어점수 입력 >> ");
		soc = scan.nextInt();
		sum2 = sum2 + soc;
		
		sum1 = sum2;
	
		System.out.println(soc + " 번호 학생의 점수 합계" + sum2);
		System.out.println("두 학생의 평균 = "+ (sum1+sum2)/6);
		
	}

}
