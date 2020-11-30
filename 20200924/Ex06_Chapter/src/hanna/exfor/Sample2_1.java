package hanna.exfor;

class Student{
	String name="xxx";
	int age;
}

public class Sample2_1 {

	public static void main(String[] args) {

		Student[] p = new Student [3]; // »ý¼ºÀÚ
		
		for (int i=0; i <3; i++) {
			p[i] = new Student();
			System.out.println(p[i].name);
			System.out.println(p[i].age);
		}
	}

}
