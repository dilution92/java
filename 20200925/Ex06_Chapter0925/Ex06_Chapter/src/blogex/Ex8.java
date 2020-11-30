package blogex;
import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int [] num = new int[10];

		System.out.println(num.length+"개의 정수를 입력하세요.(1~100사이)");
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		for(int j=1; j<=100; j++) {
			if(j%10==1) {
				System.out.print("\n"+j+" - "+(j+9)+" : ");
			}
			for(int i=0; i<num.length;i++) {
				if(num[i]==j) {
					System.out.print("*");
				}
			}
		}
		sc.close();
	}
}


