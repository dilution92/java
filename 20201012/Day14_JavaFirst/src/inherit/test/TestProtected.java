package inherit.test;

import access.sample.*;

public class TestProtected {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
	//	parent.num = 10; // protected 멤버는 다른 패키지의 클래스 밖에서는 접근 불가
		child.insert();
		child.out();
	}
}
