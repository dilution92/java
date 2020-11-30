package book;

class Test{ //클래스(Test) 안에 멤버필드, public 생성자(Test), 메소드
	String name = "이한나";
	
	public Test()	{
		String name = "이다경";
		System.out.println("Test(이건 public Test) 실행 "+ this.name);		//this로 생성자 밖 멤버필드를 받아올수 있다.
		System.out.println(name);
		print();
	}
	void print()	{
		System.out.println("print(이게 void print) 실행" + name);
	}
}



public class Sample3 {

	public static void main(String[] args) {
	Test t= new Test();
		
		/*	String name = "홍길동";
		System.out.println(name);
		print();
	}
	public static void print() {
		String name = "해결";
		System.out.println(name);*/

	}	
}

