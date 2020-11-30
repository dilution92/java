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
		System.out.println("학부생이시면 1, 대학원생이시면 2를 입력하세요. ");
		a = sc.nextInt();
		if(a == 1) {
			System.out.println("학생이름을 입력하세요.");
			name = sc.next();
			System.out.println("학과 이름을 입력하세요.");
			dep = sc.next();
			System.out.println("학년을 입력하세요.");
			grade = sc.nextInt();
			Student stu = new Student(name,dep,grade);
		}
		if(a == 2) {
			System.out.println("학생이름을 입력하세요.");
			name = sc.next();
			System.out.println("학과 이름을 입력하세요.");
			dep = sc.next();
			System.out.println("학년을 입력하세요.");
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
		System.out.println("학생이름을 입력하세요.");
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
