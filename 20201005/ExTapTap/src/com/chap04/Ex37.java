package com.chap04;

class Student {
	int studentID;
	String studentName;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}	
}

public class Ex37 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setStudentID(1);
		s.setStudentName("한나미디어");
	}
}


