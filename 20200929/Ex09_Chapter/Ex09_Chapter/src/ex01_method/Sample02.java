package ex01_method; 
public class Sample02 {

	public static void main(String[] args) {
		double myHeight = 175.9;

		//���⿡ �ڵ带 �������ּ���.

		byEveryone();
	}

	public static void hiEveryone(int age, double height) {
		System.out.println("�� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("���� Ű�� " + height + "cm �Դϴ�.");
	}

	public static void byEveryone() {
		System.out.println("������ �˰ڽ��ϴ�.");
	}
}