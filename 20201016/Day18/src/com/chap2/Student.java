package com.chap2;

public class Student {
	public String name;
	public String ssn;
	public int num;
	
	public Student() {
		
	}
	public Student(String a, String b, int c) {
		name =a;
		ssn =b;
		num =c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
class Stud extends Student{
	
	public Stud() {
		
	}
	
	public Stud(String a, String b, int c) {
		super(a,b,c);
	}
}
