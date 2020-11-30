package exam;

public class Pro02 {
	
	String name;
	int age;
	
	public Pro02(String name) {
		this.name = name;
	}
	public Pro02(int age) {
		this.age = age;
	}
	public Pro02(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "이름은 : "+name+" 나이는 : "+age;
	}
}
