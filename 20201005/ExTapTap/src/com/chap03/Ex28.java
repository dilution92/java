package com.chap03;

public class Ex28 {

	public static void main(String[] args) {
		Function(5);
	}

	public static void Function(int num) {
		if (num == 0) {
			return;
		} else {
			System.out.println("�ݰ����ϴ�");
			Function(num - 1);
		}
	}
}
