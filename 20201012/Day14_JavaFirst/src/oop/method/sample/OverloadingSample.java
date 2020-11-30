package oop.method.sample;
public class OverloadingSample {
	public void out ( ) {
		System.out.println ("out ( ) 메소드 실행!");
	}
	public void out (int num) { // 메소드 이름은 같고 매개변수가 다르다. 오버로딩 성립!
		System.out.println ("out (" + num + ") 메소드 실행!");
	}
	// 메소드 오버라이딩(상속관계가 있을 것이라면)
	// 가변인자는 사용하지 말것!
	public void out (int... num) {
		System.out.println("가변인자");
	}
}
