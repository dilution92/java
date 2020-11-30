package com.chap1;

public class Ex01 {

	public static void main(String[] args) {

		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		String strVar3 = "신민철";
		
		if(		strVar1.equals(strVar2)) {
			System.out.println("같아같아같아");
		}else {
			System.out.println("달라달라달라");
		}
		if(		strVar1 == strVar2) {
			System.out.println("같아같아같아");
		}else {
			System.out.println("달라달라달라");
		}
		if(		strVar2 == strVar3) {
			System.out.println("같아같아같아");
		}else {
			System.out.println("달라달라달라");
		}
		
	}

}
