
public class Test01 {

	/*
	  비전공자를 위한 자바 속성 강의
	 */
	static void show() {
		System.out.println("show()메소드 실행");
	}
	
	static void test() {
		System.out.println("test() 메소드 실행");
	}
	
	public static void main(String[] args) {
		test();
		test();
		show();
		System.out.println("main 메소드 실행 ");
	}
}

