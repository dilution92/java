package com.exmethod;

// 자동차 클래스
class Car
{
    int num;
    double gas;
    
    void show()
    {
        System.out.println("차량 번호는 " + num );
        System.out.println("연료 양은 " + gas );
    }
}

class Sample1
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        
        car1.num = 1234;
        car1.gas = -10.0;
        
        car1.show();
    }
}

