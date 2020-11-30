package practice;

class Hello{
	public Hello() {
		System.out.println("Hello()생성자 완료");
	}
	
	public void helloPrint() {
		System.out.println("Hello Java!");
	}
	
	public String toString() {
		return "Heeeeelllloooooooooooo";
	}
}

public class HelloJava {
	
	public static void main(String[] args) {

		Hello h = new Hello();
		h.helloPrint();
		System.out.println(h);
	}
}
