package com.exclass;
public class Book01 {
	String title;
	String author;

	public Book01(String t) { // 생성자
		title = t;
		author = "작자미상";
	}

	public Book01(String t, String a) { // 생성자
		title = t;
		author = a;
	}

	public static void main(String [] args) {
		Book01 littlePrince = new Book01("어린왕자", "생텍쥐페리");
		Book01 loveStory = new Book01("춘향전"); 
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}