package com.chap04;

public class Data {
	int age;
	String name;
	public Data() {
		name = "초기값";
		age = -1;
		System.out.println("생성자 생성완료");
		print();
	}
	public Data(String name) {
		this();
		this.name = name;
	}
	public Data(int age) {
		this();
		this.age = age;
	}
	public Data(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print(){
		System.out.println(name);
		System.out.println(age);
	}
	
}
