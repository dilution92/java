package ex.stu;//�л� �Ż� ���� ��������α׷� ���� (���� �̿�)
import java.util.Scanner;
public class Sample01 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		String name1, name2, name3; //�̸�
		int age1, age2, age3; //����
		String num1, num2, num3; //��ȭ��ȣ


		System.out.print("* �л�1 �̸� �Է� : ");
		name1 = in.next();
		System.out.print(name1+ "�� ���� �Է� : ");
		age1 = in.nextInt();
		System.out.print(name1 + "�� ��ȭ��ȣ �Է� : "); 
		num1 = in.next();// �л� 1���� 

		System.out.print("* �л�2 �̸� �Է� : ");
		name2 = in.next();
		System.out.print(name2+ "�� ���� �Է� : ");
		age2 = in.nextInt();
		System.out.print(name2 + "�� ��ȭ��ȣ �Է� : "); 
		num2 = in.next();// �л� 2 ����

		System.out.print("* �л�3 �̸� �Է� : ");
		name3 = in.next();
		System.out.print(name3+ "�� ���� �Է� : ");
		age3 =in.nextInt();
		System.out.print(name3 + "�� ��ȭ��ȣ �Է� : ");
		num3 = in.next();;// �л� 3 ����

		System.out.println("<�л� ����>");
		System.out.println("1. �̸� " + name1 + ", ���� : " + age1 + ", ��ȭ��ȣ : " + num1);
		System.out.println("2. �̸� " + name2 + ", ���� : " + age2 + ", ��ȭ��ȣ : " + num2);
		System.out.println("3. �̸� " + name3 + ", ���� : " + age3 + ", ��ȭ��ȣ : " + num3);

		for(;;) 
		{
			System.out.print("ã���ô� �л��� ���� : ");
			int a = in.nextInt();


			if (a==age1) {
				System.out.println("1. �̸� " + name1 + ", ���� : " + age1 + ", ��ȭ��ȣ : " + num1);
				System.out.println("���α׷��� �����մϴ�");
				break;
			}else if (a==age2) {
				System.out.println("2. �̸� " + name2 + ", ���� : " + age2 + ", ��ȭ��ȣ : " + num2);
				System.out.println("���α׷��� �����մϴ�");
				break;
			}else if (a==age3) {
				System.out.println("3. �̸� " + name3 + ", ���� : " + age3 + ", ��ȭ��ȣ : " + num3);
				System.out.println("���α׷��� �����մϴ�");
				break;
			}else {
				System.out.println("����� �����ϴ�. �ٽ� �Է����ּ��� ");
			}
		}
	}
}