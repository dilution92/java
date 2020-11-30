package com.chap06;

public class DeskTop extends Computer {

	public void display() {
		System.out.println("DeskTop display");
	}

	public void typing() {
		System.out.println("DeskTop typing");
	}

	@Override
	public void turnOff() {
		System.out.println("desktop turnoff");
	}

}


