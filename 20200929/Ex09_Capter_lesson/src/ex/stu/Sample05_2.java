package ex.stu; //�л� �Ż� ���� ����� ���α׷�(1���� �迭���, ���İ� Ž���߰�+Ŭ�����и� )
import java.util.Scanner;
class bbb{//����ʵ�
	Scanner in = new Scanner(System.in);

	String[] name = new String[6]; //�̸�
	int[] age = new int[3]; //����
	String[] num = new String[11]; //��ȭ��ȣ
	
	public bbb() {//������ : �ʼ�! 
		input();
	}
	void input(){ //�����Է�
		for (int i = 0; i < 3; i++) {
			System.out.print("* �л�" + (i+1) +"�� �̸� �Է� : ");
			name[i] = in.next();

			System.out.print(name[i]+ "�� ���̸� �Է� : ");
			age[i] = in.nextInt();	

			System.out.print(name[i] +"�� ��ȭ��ȣ�� �Է� : ");
			num[i] = in.next();	
		}//for
		info();
	}
	void info() { //���ĸ޼ҵ� ���ٳ���
		for (int s = 0; s < 2; s++) {
			for (int t = s+1; t < 3; t++) {
				if (age[t] > age[s]) {
					int tmp = age[t];
					age[t] = age[s];
					age[s] = tmp;//���� ���� �������
				}
			}
		}
		print();
	}
	void print() {//�л��������
		System.out.println("<�л� ����>");
	
		for (int i = 0; i < 3; i++) {
			System.out.print((i+1) + ". �̸� :" + name[i] + " ");
			System.out.print(", ���� :" + age[i] +" ");
			System.out.print(", ��ȭ��ȣ : " + num[i]+ "\n"); //�л����� ���
		}//for
		search();
	}
	void search() {//�л����� �˻�
		for(;;) 
		{
		System.out.print("ã���ô� �л��� ���� : ");
		String a = in.next();
		
		for (int i = 0; i < 3; i++) {
			if (a.equals(age[i])) {
				System.out.println("�̸� : " + name [i] +", ���� : "+ age[i]+ ", ��ȭ��ȣ : " + num[i]);	
				System.out.println("���α׷��� �����մϴ�");
				return;
			}
			}//for
			System.out.println("����� �����ϴ�. �ٽ� �Է����ּ���");	
		} 
	}
}
public class Sample05_2 {
	public static void main(String[] args) 
	{
		new bbb();
		
		/*bbb b= new bbb();
		b.input();
		b.info();
		b.print();
		b.search();
		*/
	}
}