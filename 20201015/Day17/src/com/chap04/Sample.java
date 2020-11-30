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
		System.out.println("학생이름을 입력해주세요. >>");
		a = sc.next();
	}
	
	void output() {
		System.out.println("학생이름 : "+ a);
	}
}


public class Sample {

	public static void main(String[] args) {
		Ssample s = new Ssample();
		
	}

}
