
class A{
	int a;
	public A() {
		System.out.println("a 持失切");
	}
	void aShow() {
		System.out.println("aShow()"+a);
	}
}
class B extends A{
	int b;
	public B() {
		System.out.println("b 持失切");
	}
	void bShow() {
		System.out.println("bShow()"+a);
	}
}



public class Main {

	public static void main(String[] args) {
		B b = new B();
		A a = new A();
		b.aShow();
		b.a = 10;
		b.aShow();
		a.a = 20;
		b.aShow();
		b.bShow();
		a.aShow();
	}

}
