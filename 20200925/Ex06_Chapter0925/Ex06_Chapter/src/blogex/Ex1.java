package blogex;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 

		int [] num = new int [5]; // int-�迭 Ÿ��, intArray-�迭�� ���� ���۷�������, []-�迭
		int max = 0;
		System.out.println("��� 5���� �Է��ϼ���. : ");
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"�� ���� : ");
			num[i] = sc.nextInt();
			if(num[i]>max) {
				max = num[i];
		}
		/*for(int i=0; i<num.length; i++) {
			if(num[i]>=num[0]&&num[i]>=num[1]&&num[i]>=num[2]&&num[i]>=num[3]&&num[i]>=num[4]) {
				max=num[i];
			}*/
		}
		System.out.println("���� ū ���� "+max+"�Դϴ�.");
		sc.close();
	}

}
