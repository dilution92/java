package blogex;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [] num = new int[5];
		double sum =0;
		System.out.print(num.length+"���� ������ �Է��ϼ���.");
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			sum=num[i]+sum;
		}
		System.out.println("�����"+ sum/num.length);
		sc.close();
	}

}
