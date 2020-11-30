package studyclass;

class Student {
	String name;
	int rollno, age;
}


public class ex4 {

	public static void main(String[] args) {

		Student s = new Student();
		s.name ="희석";
		s.rollno = 2;
		s.age = 29;
		
		System.out.println(s.name+s.rollno+s.age);
		
	}

}
