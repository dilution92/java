package com.ex01;

class Test{
	private String name = "�������";
	int age = -1;

	void setName(String n) {
		name= n;
	}
	
	public Test() {
		System.out.println("Test()������ ����");
	}

	void print() {
		System.out.println(name+" , "+age);
	}
}

public class Sample1 {

	public static void main(String[] args) {
		Data d = new Data();
		d.setAge(29);
		d.setName("�����");
		d.name = "aaa";
		d.age = 19;
		System.out.println(d.getAge());
		System.out.println(d.getName());
	}

}
