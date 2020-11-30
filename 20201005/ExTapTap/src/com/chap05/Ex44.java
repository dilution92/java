package com.chap05;
//탈것 인터페이스
interface iVehicle
{
	void vShow ();
}
//목재 인터페이스
interface iMaterial
{
	void mShow();
}
//자동차 클래스
class Car1 implements iVehicle, iMaterial
{
	public Car1()
	{
		System.out.println("Car1 생성자");
	}
	public void vShow()
	{
		System.out.println("vShow()");
	}
	public void mShow()
	{
		System.out.println("mShow()");
	}
}


public class Ex44 {
	public static void main(String[] args)
	{
		Car1 car1 = new Car1();
		car1.vShow();
		car1.mShow();
	}
}
