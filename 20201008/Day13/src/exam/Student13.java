package exam;

public class Student13 {

	private String name;
	private int number;
	
	public Student13(String a) {
		setName(a);
	}
	public Student13(int a) {
		setNumber(a);
	}
	public Student13(String a, int b) {
		setName(a);
		setNumber(b);
	}
	
	public void setName(String a) {
		name = a;
	}
	public void setNumber(int a) {
		number = a;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}

}
