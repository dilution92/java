package com.chap01;

public class Ex08 {
	public static void main(String[] args) {
		int b = 23;
		String str;
		// % : 나머지 
		if(b%2 == 0) {
			System.out.println("변수 b는 짝수");
		}

		if(b%2 == 1) {
			System.out.println("변수 b는 홀수");
		}
		// if문 여러개는 답을 찾아도 밑 if을 확인한다.
		
		
		str = b%2 == 0 ? "짝수" : "홀수";
		System.out.println(str);
		System.out.println("프로그램을 종료합니다.");

	}
} 

