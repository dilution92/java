package com.chap1;

public class Ex01 {

	public static void main(String[] args) {

		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö";
		String strVar3 = "�Ź�ö";
		
		if(		strVar1.equals(strVar2)) {
			System.out.println("���ư��ư���");
		}else {
			System.out.println("�޶�޶�޶�");
		}
		if(		strVar1 == strVar2) {
			System.out.println("���ư��ư���");
		}else {
			System.out.println("�޶�޶�޶�");
		}
		if(		strVar2 == strVar3) {
			System.out.println("���ư��ư���");
		}else {
			System.out.println("�޶�޶�޶�");
		}
		
	}

}
