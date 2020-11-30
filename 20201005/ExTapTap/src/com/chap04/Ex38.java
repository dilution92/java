package com.chap04;


public class Ex38 {

	public static void main(String[] args) {
		Student[] stu = new Student[3];
		
		stu[0] = new Student();
		stu[0].studentID = 1;
		stu[0].studentName = "한나미디어";
		
		System.out.println(stu[0].studentID );
		System.out.println(stu[0].studentName );
	}

}

