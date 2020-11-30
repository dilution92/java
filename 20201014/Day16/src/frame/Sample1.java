package frame;

public class Sample1 {
	int x =10;

	public Sample1() {

	}

	void show() {
		System.out.println("show()");
	}



	public static void main(String[] args) {
		Sample1 s = new Sample1() {
			public void show() {
				System.out.println("±î²á");
			}
		};
		s.show();

		Sample1 s2 = new Sample1();
		s2.show();

	}
}
