package com.chap04;

import java.util.Scanner;

class Ssample{
	Scanner sc = new Scanner(System.in);
	String a;
	
	public Ssample() {
		a = "hanna";
		input();
		output();
	}
	
	void input() {
		System.out.println("�л��̸��� �Է����ּ���. >>");
		a = sc.next();
	}
	
	void output() {
		System.out.println("�л��̸� : "+ a);
	}
}


public class Sample {

	public static void main(String[] args) {
		Ssample s = new Ssample();
		
	}

}
