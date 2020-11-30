
public class A00 {
	protected String name ;
	protected int age;
	protected String number;

	public A00() {
		
	}
	public A00(String name, int age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}