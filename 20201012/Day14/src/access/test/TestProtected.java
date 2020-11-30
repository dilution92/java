package access.test;

import access.sample.Child;
import access.sample.Parent;

public class TestProtected {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		//parent.num = 10;
		child.insert();
		child.out();
		
	}

}
