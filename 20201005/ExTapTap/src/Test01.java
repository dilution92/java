
public class Test01 {

	/*
	  �������ڸ� ���� �ڹ� �Ӽ� ����
	 */
	static void show() {
		System.out.println("show()�޼ҵ� ����");
	}
	
	static void test() {
		System.out.println("test() �޼ҵ� ����");
	}
	
	public static void main(String[] args) {
		test();
		test();
		show();
		System.out.println("main �޼ҵ� ���� ");
	}
}

