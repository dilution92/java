package ex.stu; //�л� �Ż� ���� ����� ���α׷�(1���� �迭���-Ŭ�����и�)
import java.util.Scanner;
class Test{//����ʵ�
	Scanner in = new Scanner(System.in);

	String[] name = new String[6]; //�̸�
	String[] age = new String[3];//����
	String[] num = new String[11];//��ȭ��ȣ
	
	public Test() {//������ : �ʼ�! 
		input();
	}
	void input() {//���� �Է�

		for (int i = 0; i < 3; i++) {
			System.out.print("* �л�" + (i+1) +"�� �̸� �Է� : ");
			name[i] = in.next();

			System.out.print(name[i]+ "�� ���̸� �Է� : ");
			age[i] = in.next();

			System.out.print(name[i] +"�� ��ȭ��ȣ�� �Է� : ");
			num[i] = in.next();	
		}//for
		print();
	}
	void print() {//�л��������
		System.out.println("<�л� ����>");

		for (int i = 0; i < 3; i++) {
			System.out.print((i+1) + ". �̸� :" + name[i] + " ");
			System.out.print(", ���� :" + age[i] +" ");
			System.out.print(", ��ȭ��ȣ : " + num[i]+ "\n"); 
		}//for

	}
}
public class Sample05_1 {
	public static void main(String[] args) {
		new Test(); 
	
		/*Test t= new Test();
		t.input();
		t.print();
		*/
	}
}