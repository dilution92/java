package exam;

public class Pro02Driver {

	public static void main(String[] args) {

		Pro02 p1 = new Pro02("ȫ�浿");
		p1.age = 27;
		System.out.println(p1);
		
		Pro02 p2 = new Pro02(18);
		p2.name = "�տ���";
		System.out.println(p2);
		
		Pro02 p3 = new Pro02("�̵���", 20);
		System.out.println(p3);
	}

}
