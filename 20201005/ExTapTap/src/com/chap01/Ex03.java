package com.chap01;

public class Ex03 {

	public static void main(String[] args) {

		boolean btrue = true;
		boolean bfalse = false;
		int num1 = 10;
		double num2 = 3.14;
		String str = "TabTab";
		int i = 0;
		
		System.out.println(num1);
		System.out.println(str);
		
		while(btrue) { // 무한반복문 빠져나오는 방법.
			if(i == 10) {
				btrue = false;
			}
		}
	}

}
