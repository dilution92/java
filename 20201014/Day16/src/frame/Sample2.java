package frame;

interface Show1{
	public void show1();
	public void count();
}

class Test implements Show1{
	public void show1() {
		System.out.println("show 실행");
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
				System.out.println("무명 클래스 show 실행");
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
