package blogex;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num [] = new int[10];
		int max=0, min=100000;

		System.out.println(num.length+"���� ������ �Է��ϼ���.");
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
		System.out.println("�ִ밪�� : "+max+", �ּҰ��� : "+min);
		sc.close();
	}
}
