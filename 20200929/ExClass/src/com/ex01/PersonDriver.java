package com.ex01;
import java.util.Scanner;

class Person{
	String lastName;
	String firstName;

	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public int getLength() {
		return (firstName+lastName).length();
	}
}
public class PersonDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String fname, lname;

		Person person1 = new Person();
		System.out.println("성을 입력하세요.");
		lname = sc.next();
		System.out.println("이름을 입력하세요.");
		fname = sc.next();
		person1.lastName = lname;
		person1.firstName = fname;
		System.out.println(person1.getLength());


		System.out.println("성을 입력하세요.");
		lname = sc.next();
		System.out.println("이름을 입력하세요.");
		fname = sc.next();
		Person person2 = new Person();
		person2.lastName = lname;
		person2.firstName = fname;
		System.out.println(person2.getLength());
		
		sc.close();
	}

}
