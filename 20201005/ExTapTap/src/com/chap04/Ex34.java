package com.chap04;

class Temp{
	int a = 10;
	int b = 20;
	void show() {
		int a = 11; int b = 22;
		System.out.println("show() : " +this.a + ", " + this.b);
	}
	
	void print() {
		int a = 33; int b = 44;
		System.out.println("print() : " +a + ", " + b);
	}
}
public class Ex34 {

	public static void main(String[] args) {
		Temp t = new Temp();
		t.show();
		t.print();
	}

}


