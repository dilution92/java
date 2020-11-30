package com.chap04;

public class Test {
	String name, dep;
	int age;
	
	public Test() {
		name = "성연";
		age = 20;
		dep = "컴퓨터공학과";
		System.out.println("생성자 생성완료");
		
	}
	public Test(String name) {
		this();
		this.name = name;
	}
	public Test(int age) {
		this();
		this.age = age;
	}
	public Test(String name, String dep, int age) {
		this.name = name;
		this.age = age;
		this.dep = dep;
	}
	void print()	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(dep);
	}
}
