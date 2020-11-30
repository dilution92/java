package blogex;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 

		int [] num = new int [5]; // int-배열 타입, intArray-배열에 대한 레퍼런스변수, []-배열
		int max = 0;
		System.out.println("양수 5개를 입력하세요. : ");
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번 값은 : ");
			num[i] = sc.nextInt();
			if(num[i]>max) {
				max = num[i];
		}
		/*for(int i=0; i<num.length; i++) {
			if(num[i]>=num[0]&&num[i]>=num[1]&&num[i]>=num[2]&&num[i]>=num[3]&&num[i]>=num[4]) {
				max=num[i];
			}*/
		}
		System.out.println("가장 큰 수는 "+max+"입니다.");
		sc.close();
	}

}
