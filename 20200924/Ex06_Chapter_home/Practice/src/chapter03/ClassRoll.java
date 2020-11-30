package chapter03;
//출석부를 Student 객체들의 배열로 나타낸다.

public class ClassRoll
{
	String coursename;
	int size, count=0;
	Student2 [] sbook;

	public ClassRoll() {
		size =30;
		sbook = new Student2[size];
	}
	void setCourseName(String cname) {
		coursename = cname;
	}
	String getCourseName() {
		return coursename;
	}
	void add() {
		sbook[count] = new Student2();
		count++;
	}
	int FindIndex(int find) {
		int a=-1;
		for(int i=0; i<sbook.length; i++) {
			if(i+1 == find) {
				a=i;
			}
		}
		return a;
	}

}