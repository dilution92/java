import java.util.Scanner;

public class Hanna5 {

	public static void main(String[] args) {
		
		System.out.println("�̸�, ����, ����, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); // ���ڿ� �б�
		System.out.print("�̸��� "+ name + ", ");
		
		String city = scanner.next(); // ���ڿ� �б�
		System.out.print("���ô� "+ city + ", ");
		
		int age = scanner.nextInt(); // ���� �б�
		System.out.print("���̴� "+ age + "��, ");
		
		double weight = scanner.nextDouble(); // �Ǽ� �б�
		System.out.print("ü���� "+ weight + "KG, ");
		
		boolean single = scanner.nextBoolean(); // ���� �б�
		System.out.print("���ſ��� "+ single + "�Դϴ�.");
		
		scanner.close(); // ��ĳ�� �ݱ�
		
		
		
	}

}
