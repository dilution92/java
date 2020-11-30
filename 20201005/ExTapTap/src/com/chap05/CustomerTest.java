package com.chap05;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "한나미디어");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());

	}

}
