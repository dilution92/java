package exam;

public class Pro03 {
	
	private String name;
	private int age;
	
	public Pro03(String name) {
		this.name = name;
	}
	public Pro03(int age) {
		this.age = age;
	}
	public Pro03(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "이름은 : "+name+" 나이는 : "+age;
	}
	

}
