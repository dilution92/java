package exam;

public class Pro3Driver {

	public static void main(String[] args) {

		Pro03 p1 = new Pro03("ȫ�浿");
		p1.setAge(27);
		System.out.println(p1);
		
		Pro03 p2 = new Pro03(18);
		p2.setName("�տ���");
		System.out.println(p2);
		
		Pro03 p3 = new Pro03("�̵���", 20);
		System.out.println(p3);
	}

}
