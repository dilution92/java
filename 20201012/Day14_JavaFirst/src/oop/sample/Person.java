package oop.sample;
public class Person {
	private String name; // 멤버필드
	private int age; // 멤버필드
	private char gender; // 멤버필드
	// 기본 생성자
	// 생성자의 이름은 크랠스 이름과 같아야한다.
	// 생성자는 리턴값이 없다.
	// 생성자는 public으로 하자!!
	
	public Person() {}
	// 매개변수 있는 생성자
	public Person (String name, int age, char gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	// getter, setter 메소드
	public String getName() { return name; }
	public void setName(String name) { this.name= name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	public char getGender() { return gender; }
	public void setGender(char gender) { this.gender= gender; }
}