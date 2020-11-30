
class Test01{
	int sum(int n , int m) {
	System.out.println("sum 메소드 실행");
	return n + m;
	}
	void main() {
		int i = 20;
		int s;
		char a='a'; //문자 하나
		s = sum(i, 10);
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
}

public class Hanna1 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.main(); //t.sum(10,55);	
	}
	
}