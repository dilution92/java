package com.chap04;
class Start{
	public Start() {
		System.out.println("기본 생성자");
	}
	public Start(int a ) {
		this();
		System.out.println("매개변수 1개 입력 생성자");
		
	}
	public Start(int a, int b ) {
		this();
		System.out.println("매개변수 2개 입력 생성자");
	}
}
public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Start s1 = new Start(1);
		Start s2 = new Start(2,3);
	}

}


