package com.chap01;

public class Ex07 {
	public static void main(String[] args) {
		int a = 10;
		int res = 0;
		
		res = a > 5 ? 1 : -1 ;
		
		if(a > 5) {
			res =1;
		} else {
			res= -1;
		}
		
		System.out.println(res);
	}
}

