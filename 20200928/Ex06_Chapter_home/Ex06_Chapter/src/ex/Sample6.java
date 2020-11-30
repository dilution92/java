package ex;
import java.util.Scanner;
public class Sample6 {

	public static void main(String[] args) {

		int num = 50 , i=0;

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for(i=1; i<=100; i++) {
			System.out.print(" 정답을 추측해 보시오.(1~100) : ");
			int res = sc.nextInt();
			if(res==num) {
				System.out.println("축하합니다.");
				System.out.print("시도횟수 : "+i);
				break;
			}else if (res>num){
				System.out.print("제시한 정수가 높습니다.");
			}
			else if (res<num){
				System.out.print("제시한 정수가 낮습니다.");
			}	
		}
		sc.close();
	}

}
