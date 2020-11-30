package com.exproject;

import java.util.Scanner;

class Project03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] gradeInfo = new String[3][3];

		String findAge;
		int i, j;
		for (i = 0; i < 3; i++) {
			System.out.print((i + 1) + ". 이름 입력 :");
			gradeInfo[0][i] = input.next();
			System.out.print((i + 1) + ". 나이 입력 :");
			gradeInfo[1][i] = input.next();
			System.out.print((i + 1) + ". 번호 입력 :");
			gradeInfo[2][i] = input.next();
		}

		for (i = 0; i < 3; i++) {
			System.out.print((i + 1) + ". 이름 출력 :" + gradeInfo[0][i]);
			System.out.print((i + 1) + ". 나이 출력 :" + gradeInfo[1][i]);
			System.out.print((i + 1) + ". 번호 출력 :" + gradeInfo[2][i]);
			System.out.println("");
		}

		System.out.print("\n#나이로 검색하세요. 검색할 나이를 입력하세요.");
		findAge = input.next();
		int count = 0;
		for (i = 0; i < 3; i++) {

			if (findAge.equals(gradeInfo[1][i])) {
				System.out.print("검색된 아이 이름 :" + gradeInfo[0][i]);
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println("검색된 결과값이 없습니다");
		}

		System.out.println("프로그램을 종료합니다");

	}
}
