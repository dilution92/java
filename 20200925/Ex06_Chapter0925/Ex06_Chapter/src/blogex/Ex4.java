package blogex;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [] num1 = new int[5];
		int [] num2 = new int[5];
		int [] num3 = new int[5];
		
		System.out.println("ù �迭 ������ 5�� �Է��ϼ���.");
		for (int i=0; i<num1.length; i++) {
			num1[i] = sc.nextInt(); 
		}
		System.out.println("�ι�° �迭 ������ 5�� �Է��ϼ���.");
		for (int i=0; i<num1.length; i++) {
			num2[i] = sc.nextInt(); 
			num3[i] = num2[i]+num1[i];
		}
		System.out.println("A�迭\tB�迭\tC�迭");
		for(int i=0; i<num1.length; i++) {
			System.out.println(num1[i]+"\t"+num2[i]+"\t"+num3[i]);
		}
		sc.close();
	}

}
