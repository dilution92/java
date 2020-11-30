package com.chap02;

public class Ex10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;

		if(score >= 90) {
			System.out.println("A학점");
		}else if(score >= 80) {
			System.out.println("B학점");	
		}else {
			System.out.println("F학점");
		}

		System.out.println("프로그램을 종료합니다.");

	}
}



/*

	

		int rank = 1;
		char medalColor;

		switch(rank) {
		case 1: medalColor = 'G';
		System.out.println("금메달");
		break;
		case 2: medalColor = 'S';
		System.out.println("은메달");
		break;
		case 3: medalColor = 'B';
		System.out.println("동메달");
		break;
		default : medalColor = 'X';
		}
		System.out.println( rank + "등은 " + medalColor + "메달 입니다.");

 */