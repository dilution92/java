package studentpack;

import java.util.ArrayList;
import java.util.Scanner;

public class Subject {
	
	Scanner sc = new Scanner(System.in);
	
	String subname;
	int roomnum, studcount;
	ArrayList <Student1> stud;
	Student1 st;

	public Subject() {
		stud = new ArrayList<Student1>();
		studcount =0;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public int getRoomnum() {
		return roomnum;
	}

	public void setRoomnum(int roomnum) {
		this.roomnum = roomnum;
	}
	
	public void addStu() {
		st = new Student1();
		System.out.println("학생 이름을 입력하세요 : ");
		st.setName(sc.next());
		System.out.println("학생 번호를 입력하세요 : ");
		st.setNumber(sc.nextInt());
		stud.add(st);
		studcount++;
	}
	
	public void showStu() {
		System.out.println("이름"+"\t"+"번호");
		for (int i = 0; i < studcount; i++) {
			System.out.println(stud.get(i).getName()+"\t"+stud.get(i).getNumber());
		}
	}
}
