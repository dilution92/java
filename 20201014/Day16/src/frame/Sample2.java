package frame;

interface Show1{
	public void show1();
	public void count();
}

class Test implements Show1{
	public void show1() {
		System.out.println("show ����");
	}
	public void count() {

	}
}

public class Sample2 {

	public static void main(String[] args) {
		Test t = new Test();
		t.show1();

		Show1 s = new Show1() {
			public void show1() {
				System.out.println("���� Ŭ���� show ����");
			}
			public void count() {

			}
		};
		s.show1();
		s.show1();

		Show1 s1 = new Show1() {
			public void show1() {
				System.out.println("adsfasdf");
			}
			public void count() {

			}
		};
		s1.show1();
	}

}
