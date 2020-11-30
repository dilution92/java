package com.chap02;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if else 문 안에 if문
		int x = 10;
		int y = 3;

		if(x>y) {
			System.out.println("x는 y값 보다 큽니다.");
			
			if(x >= 0) {
				System.out.println("x값은 0보다 크거나 같습니다.");
			}
		}
		else {
			System.out.println("x는 y값 작거나 같습니다.");
		}
	}
}
