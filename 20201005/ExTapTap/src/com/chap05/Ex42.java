package com.chap05;


public class Ex42 {

	public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        
        Car car3;
        car3 = car1;
        
        boolean bl1 = car1.equals(car2);
        boolean bl2 = car1.equals(car3);
        
        System.out.println ("car1과 car2가 같은지 조사한 결과, " + bl1 );
        System.out.println ("car1과 car3이 같은지 조사한 결과, " + bl2 );

	}
}


