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
			System.out.print((i + 1) + ". 이름 입력 :");
			name[i] = input.next();
			System.out.print((i + 1) + ". 나이 입력 :");
			age[i] = input.nextInt();
			System.out.print((i + 1) + ". 번호 입력 :");
			number[i] = input.next();
		}

		for (i = 0; i < 3; i++) {
			System.out.print((i + 1) + ". 이름 출력 :" + name[i]);
			System.out.print((i + 1) + ". 나이 출력 :" + age[i]);
			System.out.print((i + 1) + ". 번호 출력 :" + number[i]);
			System.out.println("");
		}

		System.out.print("\n#나이로 검색하세요. 검색할 나이를 입력하세요.");
		findAge = input.nextInt();
		for (i = 0; i < 3; i++) {
			if (findAge == age[i]) {
				System.out.print("검색된 아이 이름 :" + name[i]);
				break;
			}
			if (i == 2) {
				System.out.println("검색된 결과값이 없습니다");
			}
		}

		System.out.println("프로그램을 종료합니다");

	}
}
