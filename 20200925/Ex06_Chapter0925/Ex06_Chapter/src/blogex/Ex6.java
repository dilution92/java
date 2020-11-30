package blogex;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num [] = new int[10];
		int max=0, min=100000;

		System.out.println(num.length+"개의 정수를 입력하세요.");
		for(int i =0; i<num.length; i++) {
			num[i] = sc.nextInt();
			if(num[i]>max) {
				max = num[i];
			}
		}
		for(int i =0; i<num.length; i++) {
			if(num[i]<min) {
				min = num[i];
			}
		}
		System.out.println("최대값은 : "+max+", 최소값은 : "+min);
		sc.close();
	}
}
