package school;

public class Student {
	protected String name;
	protected String dep;
	protected int grade;
	
	public Student() {
		
	}
	public Student(String name, String dep, int grade) {
		this.name = name;
		this.dep = dep;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
