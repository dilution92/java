package com.chap04;

import java.util.ArrayList;

class ArrayStu{
	String name;
	int number;
	
	@Override
	public String toString() {
		return  name + ", " + number ;
	}
}
public class Ex39 {

	public static void main(String[] args) {
		ArrayList<ArrayStu> list = new ArrayList<ArrayStu>();
		ArrayStu s = new ArrayStu();
		s.name = "한나미디어";
		s.number = 1;
		list.add(s);
		list.add(s);
		list.add(s);
		
		for(int i=0; i<list.size(); i++) {
			ArrayStu stu = list.get(i);
			System.out.println(stu);
		}
		
	}

}
