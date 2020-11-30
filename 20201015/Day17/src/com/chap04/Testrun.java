package com.chap04;

public class Testrun {

	public static void main(String[] args) {
		Test t = new Test();
		t.print();
		Test t1 = new Test("Èñ¼®");
		t1.print();
		Test t2 = new Test(25);
		t2.print();
		Test t3 = new Test("¿¹¸°", "³»°¡ÀÌ»Û°ú", 24);
		t3.print();
	}

}
