package ex.stu; //�л� �Ż� ���� ����� ���α׷�(2���� �迭���)
import java.util.Scanner;
public class Sample03 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		String[][] arr = new String[3][3];

		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print("* �л� " + (i+1) + "�� �̸� �Է� : ");
			arr[i][0] = in.next();
			
			System.out.print(arr[i][0] + "�� ���� �Է� : ");
			arr[i][1] = in.next();

			System.out.print(arr[i][0]+ "�� ��ȭ��ȣ �Է� : ");
			arr[i][2] = in.next();
		}//for

		System.out.println("<�л� ����>");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+ ". �̸� : " + arr[i][0]);
			System.out.print(", ���� : " + arr[i][1]);
			System.out.print(", ��ȭ��ȣ : " + arr[i][2]);
			System.out.println(" ");
		}//for
		for(;;) {
			System.out.println("ã���ô� �л��� ���� : ");
			String a = in.next();

			for (int i = 0; i < arr.length; i++) {
				if (a==arr[i][1]) {
					System.out.println("�̸� : " + arr[i][0] + ", ���� : " + arr[i][1]+", ��ȭ��ȣ : " + arr[i][2]);
					System.out.println("���α׷��� �����մϴ�");
					return;
				}
			}//for
			System.out.println("����� �����ϴ�. �ٽ� �Է����ּ���");	
		}
	}
}