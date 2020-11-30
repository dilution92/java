package com.chap04;

class Tmp{
	int a = 10;
	int b = 20;
	void show() {
		System.out.println("show() : " +a + ", " + b);
	}
	
	void print() {
		System.out.println("print() : " +a + ", " + b);
	}
}
public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tmp t = new Tmp();
		t.show();
		t.print();
	}

}


