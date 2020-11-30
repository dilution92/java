package com.chap05;

//탈것 클래스
abstract class Vehicle
{
	protected int speed;
	abstract void show();
}

//자동차 클래스
class MiniCar extends Vehicle
{
	public void show()
	{
		speed =10;
		System.out.println("속도는 " +  speed + " 입니다.");
	}
}
//비행기 클래스
class Plane extends Vehicle
{
	public void show()
	{
		speed =20;
		System.out.println("속도는 " +  speed + " 입니다.");
	}
}
public class Ex43 {

	public static void main(String[] args) {
		Vehicle[] vc = new Vehicle[2];

		vc[0] = new MiniCar();
		vc[1] = new Plane();

		for(int i=0; i<vc.length; i++){
			vc[i].show();
		}
	}
}
