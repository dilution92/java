package com.chap1;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		ArrayList<Info> list = new ArrayList<Info>();
		Info in = new Info();
		in.name = "hanna";
		in.number = 1234;
		
		list.add(in);
		
		Info in1 = new Info();
		in1.name = "Èñ¼®";
		in1.number = 9999;
		
		list.add(in1);
		
		System.out.println(list.get(0).name);
		System.out.println(list.get(0).number);
		System.out.println(list.get(1).name);
		System.out.println(list.get(1).number);
		
	}
}
