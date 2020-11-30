package test.poly;
import poly.sample.*;
public class TestPolymorphism {
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
		c.out();
		System.out.println();
		Parent p = new Child();
		p.display(); //Overriding 된 parent 멤버이므로 접근 가능
		//p.out(); //컴파일에러. Parent 타입으로 Child 멤버에 접근할 수 없음.
	}
}