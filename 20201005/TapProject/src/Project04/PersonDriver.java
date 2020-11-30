package Project04;

public class PersonDriver {
	Person p = new Person();
	public PersonDriver() {
		p.age = 40;
		p.name = "James";
		p.isMarried = true;
		p.numberOfChildren = 3;
		print();
	}
	
	void print() {
		System.out.println("age : " + p.age);
		System.out.println("name : " + p.name);
		System.out.println("isMarried : " + p.isMarried);
		System.out.println("numberOfChildren : " + p.numberOfChildren);
	}

	public static void main(String[] args) {

		new PersonDriver();

	}

}
