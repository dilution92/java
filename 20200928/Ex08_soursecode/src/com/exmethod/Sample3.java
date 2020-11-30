package com.exmethod;

class Car2 {
	private int num;
	private double gas;

	public void setCar(int n) {
		num = n;
		System.out.println("차량 번호를 " + num + " 으로 바꾸었습니다.");
	}

	public void setCar(double g) { //이름은 같지만 메소드 오버로딩
		gas = g;
		System.out.println("연료 양을 " + gas + " 으로 바꾸었습니다.");
	}

	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호를 " + num + ", 연료 양을 " + gas);
	}

	public void show() {
		System.out.println("차량 번호는 " + num + " 입니다.");
		System.out.println("연료 양은 " + gas + " 입니다.");
	}
}

class Sample3 {
	public static void main(String[] args) {
		Car2 car1 = new Car2();
		car1.setCar(1234, 20.5);
		car1.show();
		System.out.println("차량 번호만 변경 되었습니다.");
		car1.setCar(2345);
		car1.show();
		System.out.println("연료량만 변경 되었습니다.");
		car1.setCar(30.5);
		car1.show();
	}
}
