
import java.util.Scanner;

public class Sample11 {

	public static void main(String[] args) {

		int num1, num2;
		int kor1, kor2;
		int math1, math2;
		int eng1, eng2;
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("�л���ȣ �Է� >> ");
		num1 = scan.nextInt();
		System.out.print("�������� �Է� >> ");
		kor1 = scan.nextInt();
		System.out.print("�������� �Է� >> ");
		math1 = scan.nextInt();
		System.out.print("�������� �Է� >> ");
		eng1 = scan.nextInt();
		
		System.out.println("�л���ȣ "+num1+" �Ϸ�!!");
		System.out.println("���� �л� ��ȣ �Է�");
		System.out.print("�л���ȣ �Է� >> ");
		num2 = scan.nextInt();
		System.out.print("�������� �Է� >> ");
		kor2 = scan.nextInt();
		System.out.print("�������� �Է� >> ");
		math2 = scan.nextInt();
		System.out.print("�������� �Է� >> ");
		eng2 = scan.nextInt();
		
		int sum2= (kor2+math2+eng2);
		
		System.out.println("                     ");
		System.out.println("                     ");
		
		System.out.println("������������������������������������������");
		System.out.println("�л���ȣ : "+ num1);
		System.out.println("�������� : "+ kor1);
		System.out.println("�������� : "+ math1);
		System.out.println("�������� : "+ eng1);
		System.out.println("�� ���� : "+ (kor1+math1+eng1));
		System.out.println("������� : "+ (kor1+math1+eng1)/3);
		System.out.println("������������������������������������������");
		
		System.out.println("                     ");
		System.out.println("                     ");
		
		System.out.println("������������������������������������������");
		System.out.println("�л���ȣ : "+ num2);
		System.out.println("�������� : "+ kor2);
		System.out.println("�������� : "+ math2);
		System.out.println("�������� : "+ eng2);
		System.out.println("�� ���� : "+ sum2);
		System.out.println("������� : "+ sum2/3);
		System.out.println("������������������������������������������");

		
	}

}
