package com.exclasspointer;

class Car
{
   	int num; // 차량 번호
    double gas; // 남은 연료의 양
}


class Sample1
{ 
	public static void main(String[] args)
   	{  
		Car car1;   
		car1 = new Car(); 
		car1.num = 1234;   
		car1.gas = 20.5;

		System.out.println("차량 번호는 " + car1.num + "입니다.");     
		System.out.println("연료 양은 " + car1.gas + "입니다.");
  
	}
}

