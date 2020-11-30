package com.chap03;

public class Ex27 {

	static int getNum(int a) {
		return a;
	}

	static int getNum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		int c = getNum(12, 13);

		System.out.println(c);
	}
}

