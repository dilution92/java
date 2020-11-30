package hashmap;

import java.util.*;

public class HashsetEx {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String str = sc.next(); 
		set.add(new Person(str, 36));
		set.add(new Person("mina", 18));
		System.out.println(set);
	}
}

class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + ":" + age;
	}
}