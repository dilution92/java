package com.chap1;

import java.util.ArrayList;
import java.util.List;

class Info{
	public String name;
	public int number;
	
	
	public Info() {
		
	}
	
	public String toString() {
		return name + number	;
	}
}



public class Ex3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("c++");
		
		int size = list.size();
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+" : "+str);
		}
	}
}
