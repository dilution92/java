package ex.stu; //�л� �Ż� ���� ����� ���α׷�(1���� �迭���, ���İ� Ž���߰� )
import java.util.Scanner;
public class Sample04 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		String[] name = new String[6]; //�̸�
		int[] age = new int[3]; //����
		String[] num = new String[11]; //��ȭ��ȣ


		for (int i = 0; i < 3; i++) {
			System.out.print("* �л�" + (i+1) +"�� �̸� �Է� : ");
			name[i] = in.next();

			System.out.print(name[i]+ "�� ���̸� �Է� : ");
			age[i] = in.nextInt();	

			System.out.print(name[i] +"�� ��ȭ��ȣ�� �Է� : ");
			num[i] = in.next();
		}//for

		System.out.println("<�л� ����>");
		
		for (int s = 0; s < 2; s++) {
			for (int t = s+1; t < 3; t++) {
				if (age[t] > age[s]) {
					int tmp = age[t];
					age[t] = age[s];
					age[s] = tmp;//���� ���� �������
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.print((i+1) + ". �̸� :" + name[i] + " ");
			System.out.print(", ���� :" + age[i] +" ");
			System.out.print(", ��ȭ��ȣ : " + num[i]+ "\n"); //�л����� ���
		}//for
		
		for(;;) 
		{
		System.out.print("ã���ô� �л��� ���� : ");
		int a = in.nextInt();
		
		for (int i = 0; i < 3; i++) {
			if (a == age[i]) {
				System.out.println("�̸� : " + name [i] +", ���� : "+ age[i]+ ", ��ȭ��ȣ : " + num[i]);	
				System.out.println("���α׷��� �����մϴ�");
				return;//�� �л��� ���̰� �ߺ��Ǿ��� ���, �� �л��� ���� ����ϰ������ ��ó���л��� ��µǰ� ����
			}
			}//for
			System.out.println("����� �����ϴ�. �ٽ� �Է����ּ���");	
		} 
	}
}