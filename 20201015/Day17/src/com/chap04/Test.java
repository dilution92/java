package com.chap04;

public class Test {
	String name, dep;
	int age;
	
	public Test() {
		name = "����";
		age = 20;
		dep = "��ǻ�Ͱ��а�";
		System.out.println("������ �����Ϸ�");
		
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
