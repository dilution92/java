package example;
import java.util.Scanner; 

public class Exam02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���۹� ������ ���� : ");
		int eng = scan.nextInt();
		System.out.print("���α׷��� ������ ���� : ");
		int pro = scan.nextInt();
		System.out.print("�̻���� ������ ���� : ");
		int mat = scan.nextInt();
		System.out.print("��ǻ�ͱ��� ������ ���� : ");
		int com = scan.nextInt();
		System.out.print("��� ���� :" + (eng+pro+mat+com)/4.0);

		scan.close();
	}

}
