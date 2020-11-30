package chapter03;
//출석부의 한 학생을 나타낸다.
public class Student2
{
	String name;
	int num;
 
	public Student2() {
		
	}
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getNum() {
		return num;
	}

	void setNum(int num) {
		this.num = num;
	}
	
	public String toString() {
		return "이름 : "+name+", 학번 : "+num;
	}
	
	
}