
import java.util.Scanner;

public class Sample11_1 {

	public static void main(String[] args) {

		int num;
		int soc;
		int sum1;
		int sum2;
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("�л���ȣ �Է� >> ");
		soc = scan.nextInt();//1
		sum2 = soc
		System.out.print("1. �������� �Է� >> ");
		soc = scan.nextInt();//50
		sum1 = soc;
		System.out.print("1. �������� �Է� >> ");
		soc = scan.nextInt();//90
		sum1 = sum1 + soc;
		System.out.print("1. �������� �Է� >> ");
		soc = scan.nextInt();//80
		sum1 = sum1 + soc;
		
		System.out.println(sum2 + " ��ȣ �л��� ���� �հ�" + sum1);

		System.out.print("�л���ȣ �Է� >> ");
		soc = scan.nextInt();
		soc = sum2;
		sum1 = 
		System.out.print("2. �������� �Է� >> ");
		soc = scan.nextInt();
		sum2 = soc;
		System.out.print("2. �������� �Է� >> ");
		soc = scan.nextInt();
		sum2 = sum2 + soc;
		System.out.print("2. �������� �Է� >> ");
		soc = scan.nextInt();
		sum2 = sum2 + soc;
		
		sum1 = sum2;
	
		System.out.println(soc + " ��ȣ �л��� ���� �հ�" + sum2);
		System.out.println("�� �л��� ��� = "+ (sum1+sum2)/6);
		
	}

}
