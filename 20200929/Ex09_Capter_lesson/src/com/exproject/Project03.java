package com.exproject;

import java.util.Scanner;

class Project03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] gradeInfo = new String[3][3];

		String findAge;
		int i, j;
		for (i = 0; i < 3; i++) {
			System.out.print((i + 1) + ". �̸� �Է� :");
			gradeInfo[0][i] = input.next();
			System.out.print((i + 1) + ". ���� �Է� :");
			gradeInfo[1][i] = input.next();
			System.out.print((i + 1) + ". ��ȣ �Է� :");
			gradeInfo[2][i] = input.next();
		}

		for (i = 0; i < 3; i++) {
			System.out.print((i + 1) + ". �̸� ��� :" + gradeInfo[0][i]);
			System.out.print((i + 1) + ". ���� ��� :" + gradeInfo[1][i]);
			System.out.print((i + 1) + ". ��ȣ ��� :" + gradeInfo[2][i]);
			System.out.println("");
		}

		System.out.print("\n#���̷� �˻��ϼ���. �˻��� ���̸� �Է��ϼ���.");
		findAge = input.next();
		int count = 0;
		for (i = 0; i < 3; i++) {

			if (findAge.equals(gradeInfo[1][i])) {
				System.out.print("�˻��� ���� �̸� :" + gradeInfo[0][i]);
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println("�˻��� ������� �����ϴ�");
		}

		System.out.println("���α׷��� �����մϴ�");

	}
}
