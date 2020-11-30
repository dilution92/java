package com.chap04;

class Data {
	String name;
	int age;

	public Data() {
		name = "초기값";
		age = -1;
		System.out.println("생성자 생성완료");
	}

	void print() {
		System.out.println(name);
		System.out.println(age);
	}
}

public class Ex30 {
	public static void main(String[] args) {
		Data d = new Data();
		d.print();
	}
}

