package book;

class Test{ //Ŭ����(Test) �ȿ� ����ʵ�, public ������(Test), �޼ҵ�
	String name = "���ѳ�";
	
	public Test()	{
		String name = "�̴ٰ�";
		System.out.println("Test(�̰� public Test) ���� "+ this.name);		//this�� ������ �� ����ʵ带 �޾ƿü� �ִ�.
		System.out.println(name);
		print();
	}
	void print()	{
		System.out.println("print(�̰� void print) ����" + name);
	}
}



public class Sample3 {

	public static void main(String[] args) {
	Test t= new Test();
		
		/*	String name = "ȫ�浿";
		System.out.println(name);
		print();
	}
	public static void print() {
		String name = "�ذ�";
		System.out.println(name);*/

	}	
}

