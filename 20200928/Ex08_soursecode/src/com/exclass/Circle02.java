package com.exclass;
public class Circle02 {
		int radius; 
		String name; 

		public Circle02() { // 매개 변수 없는 생성자
			radius = 1; name = ""; // 필드 초기화
		}
		
		public Circle02(int r, String n) { // 매개 변수를 가진 생성자
			radius = r; name = n; // 매개 변수로 필드 초기화 
		}

		public double getArea() {
			return 3.14*radius*radius;
		}

		public static void main(String[] args) {
			Circle02 pizza = new Circle02(10, "자바피자"); 
			double area = pizza.getArea();
			System.out.println(pizza.name + "의 면적은 " + area);
			
			Circle02 donut = new Circle02(); // 객체 생성, 반지름을 1, 이름을 ""로 초기화
			donut.name = "도넛피자"; // 이름 변경
			area = donut.getArea();
			System.out.println(donut.name + "의 면적은 " + area);
		}
	}