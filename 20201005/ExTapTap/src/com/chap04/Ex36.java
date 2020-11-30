package com.chap04;

class MyDate {

	private int day; 

	public void setDay(int day) {
		this.day = day; 
	}

	public int getDay() {
		return day;
	}

}
public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate my = new MyDate();
		my.setDay(16);
		System.out.println(my.getDay());
	}

}


