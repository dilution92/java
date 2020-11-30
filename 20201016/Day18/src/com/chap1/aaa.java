package com.chap1;

import java.util.ArrayList;
import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {
		ArrayList <Info> list = new ArrayList<Info>();
		Scanner sc = new Scanner(System.in);
		int select;
		Info in;
		int count = 0	;

		for(;;) {
			System.out.println("메뉴");
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 종료");
			select = sc.nextInt();

			if(select ==1 ) {
				in = new Info();
				System.out.println("이름 입력");
				in.name = sc.next();
				System.out.println("번호 입력");
				in.number = sc.nextInt();
				list.add(in);
				count++;
				
			}if(select == 2 ) {
				for (int i = 0; i < count; i++) {
					System.out.println(list.get(i).name);
					System.out.println(list.get(i).number);
				}
				
			}if(select ==3) {
				System.out.println("종료");
				break;
			}
		}
	}
}
