package com.exproject;

import java.util.*;

class Project02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] name = new String[3];
		int[] age = new int[3];
		String[] number = new String[3];
		int findAge, i;
		for (i = 0; i < 3; i++) {
			System.out.print((i + 1) + ". �̸� �Է� :");
			name[i] = input.next();
			System.out.print((i + 1) + ". ���� �Է� :");
			age[i] = input.nextInt();
			System.out.print((i + 1) + ". ��ȣ �Է� :");
			number[i] = input.next();
		}

		for (i = 0; i < 3; i++) {
			System.out.print((i + 1) + ". �̸� ��� :" + name[i]);
			System.out.print((i + 1) + ". ���� ��� :" + age[i]);
			System.out.print((i + 1) + ". ��ȣ ��� :" + number[i]);
			System.out.println("");
		}

		System.out.print("\n#���̷� �˻��ϼ���. �˻��� ���̸� �Է��ϼ���.");
		findAge = input.nextInt();
		for (i = 0; i < 3; i++) {
			if (findAge == age[i]) {
				System.out.print("�˻��� ���� �̸� :" + name[i]);
				break;
			}
			if (i == 2) {
				System.out.println("�˻��� ������� �����ϴ�");
			}
		}

		System.out.println("���α׷��� �����մϴ�");

	}
}
