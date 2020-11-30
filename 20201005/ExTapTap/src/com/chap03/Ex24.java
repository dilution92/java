package com.chap03;

public class Ex24 {

	static int a = 11;  // 멤버필드

	static void print() {  //메소드(기능)
		int a = -1;
		System.out.println("print() : " + a);
	}

	public static void main(String[] args) {

		System.out.println("main() : " + a);
		print();
	}

}


