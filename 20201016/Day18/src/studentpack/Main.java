package studentpack;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int subcount;
	ArrayList <Subject> sub ;
	Subject su;
	public Main() {
		sub = new ArrayList<Subject>(); 
		subcount=0;
	}
	
	public void addSub() {
		su = new Subject();
		System.out.println("교과목을 입력하세요.");
		su.setSubname(sc.next());
		System.out.println("강의실을 입력하세요.");
		su.setRoomnum(sc.nextInt());
		sub.add(su);
		subcount++;
	}
	
	public void addSubStu() {
		System.out.println("교과목을 입력하세요.");
		String res = sc.next();
		for (int i = 0; i < subcount; i++) {
			if(res.equals(sub.get(i).getSubname())) {
				sub.get(i).addStu();
			}
		}
	}
	
	public void show() {
		for (int i = 0; i <subcount; i++) {
			System.out.println("과목 명 : "+sub.get(i).getSubname()+"장소 : "+sub.get(i).getRoomnum()+"호");
				sub.get(i).showStu();
		}
	}
}
