package ex.stu; //�л� �Ż� ���� ����� ���α׷�(1���� �迭���)
import java.util.Scanner;
public class Sample02 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		String[] name = new String[6]; //�̸�
		int[] age = new int[3];//����
		int[] num = new int[11];//��ȭ��ȣ


		for (int i = 0; i < 3; i++) {
			System.out.print("* �л�" + (i+1) +"�� �̸� �Է� : ");
			name[i] = in.next();

			System.out.print(name[i]+ "�� ���̸� �Է� : ");
			age[i] = in.nextInt();

			System.out.print(name[i] +"�� ��ȭ��ȣ�� �Է� : ");
			num[i] = in.nextInt();	//0�� �ȸ��� 
		}//for

		System.out.println("<�л� ����>");

		for (int i = 0; i < 3; i++) {
			System.out.print((i+1) + ". �̸� :" + name[i] + " ");
			System.out.print(", ���� :" + age[i] +" ");
			System.out.print(", ��ȭ��ȣ : " + num[i]+ "\n"); //�л����� ���
		}//for


	}
}