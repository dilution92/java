package com.chap01;

public class Ex08 {
	public static void main(String[] args) {
		int b = 23;
		String str;
		// % : ������ 
		if(b%2 == 0) {
			System.out.println("���� b�� ¦��");
		}

		if(b%2 == 1) {
			System.out.println("���� b�� Ȧ��");
		}
		// if�� �������� ���� ã�Ƶ� �� if�� Ȯ���Ѵ�.
		
		
		str = b%2 == 0 ? "¦��" : "Ȧ��";
		System.out.println(str);
		System.out.println("���α׷��� �����մϴ�.");

	}
} 

