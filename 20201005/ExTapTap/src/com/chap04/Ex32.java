package com.chap04;

class Info {
	String name;
	int age;

	public Info() {
		name = "초기값";	age = -1;
		System.out.println("생성자()생성완료");
	}

	public Info(String n, int a) { // 생성자 오버로딩
		this();
		name = n;	age = a;
		System.out.println("생성자(Str, int) 생성완료");
	}

	void print() {
		System.out.println(name);
		System.out.println(age);
	}
}

public class Ex32 {
	public static void main(String[] args) {
		Info in = new Info();
		in.print();

		Info fo = new Info("한나미디어", 29);
		fo.print();
	}
}

