package school;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	Scanner sc = new Scanner(System.in);
	int select;
	ArrayList <Student> stu = new ArrayList<>();
	ArrayList <StuDr> dr = new ArrayList<>();
	
	public Driver() {
		
	}
	
	public void add() {
		String name, dep;
		int grade;
		int a;
		System.out.println("�кλ��̽ø� 1, ���п����̽ø� 2�� �Է��ϼ���. ");
		a = sc.nextInt();
		if(a == 1) {
			System.out.println("�л��̸��� �Է��ϼ���.");
			name = sc.next();
			System.out.println("�а� �̸��� �Է��ϼ���.");
			dep = sc.next();
			System.out.println("�г��� �Է��ϼ���.");
			grade = sc.nextInt();
			Student stu = new Student(name,dep,grade);
		}
		if(a == 2) {
			System.out.println("�л��̸��� �Է��ϼ���.");
			name = sc.next();
			System.out.println("�а� �̸��� �Է��ϼ���.");
			dep = sc.next();
			System.out.println("�г��� �Է��ϼ���.");
			grade = sc.nextInt();
			StuDr stu = new StuDr(name,dep,grade);
		}
	}
	public void print() {
		int length = dr.size()	;
		for(int i=0; i<length; i++) {
			System.out.println(dr.get(i).getName());
			System.out.println(dr.get(i).getDep());
			System.out.println(dr.get(i).getGrade());
		}
	}
	public void search() {
		System.out.println("�л��̸��� �Է��ϼ���.");
		String name = sc.next();
		for(int i=0; i<dr.size(); i++) {
			if(name.equals(dr.get(i).getName())) {
				System.out.println(dr.get(i).getName());
				System.out.println(dr.get(i).getDep());
				System.out.println(dr.get(i).getGrade());
			}
		}
	}
}
