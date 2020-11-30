package com.chap05;


public class Ex41 {

	public static void main(String[] args) {
		Car[] cars;
		cars = new Car[2];

		cars[0] = new Car();
		cars[1] = new RacingCar();

		for(int i=0; i< cars.length; i++){
			System.out.println(cars[i]);
		}

	}
}

