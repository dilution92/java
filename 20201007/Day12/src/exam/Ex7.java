package exam;

import java.util.Scanner;

class Course{
	String name;
	int size;
	int count=0;
	Student stu [];

	public Course() {
		size=10;
		stu = new Student[size];
	}
	void add() {
		stu[count]=new Student();
		count++;
	}
}

class Student{
	String name;
	public Student() {

	}
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
}

class Driver{
	
}

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans;
		String cres, nres;
		Course [] c = new Course[3];
		for(int i=0; i<c.length; i++) {
			c[i] = new Course();
		}
		c[0].name = "�ڹ�";
		c[1].name = "C";
		c[2].name = "C++";

		for(;;) {
			System.out.println("1. �߰�");
			System.out.println("2. �˻�");
			System.out.println("3. ����");
			ans = sc.nextInt();

			if(ans == 1) {
				System.out.println("�л� �̸��� �Է��ϼ���. : ");
				nres = sc.next();
				System.out.println("���� ���� �Է��ϼ���. : ");
				cres = sc.next();
				for(int i=0; i<c.length; i++) {
					if(c[i].name.equals(cres)) {
						c[i].add();
						c[i].stu[c[i].count-1].setName(nres);
						//c[0].stu[0].setName("��")
					}
				}
			}
			else if(ans == 2) {
				for(int i=0; i<c.length; i++) {
					for(int j=0; j<c[i].count; j++) {
						System.out.println("����� : "+c[i].name+"  �̸� : "+c[i].stu[j].name);
					}
				}
			}
			else if(ans ==3) {
				break;
			}
		}
	}
}
