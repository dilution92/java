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
		System.out.println("�������� �Է��ϼ���.");
		su.setSubname(sc.next());
		System.out.println("���ǽ��� �Է��ϼ���.");
		su.setRoomnum(sc.nextInt());
		sub.add(su);
		subcount++;
	}
	
	public void addSubStu() {
		System.out.println("�������� �Է��ϼ���.");
		String res = sc.next();
		for (int i = 0; i < subcount; i++) {
			if(res.equals(sub.get(i).getSubname())) {
				sub.get(i).addStu();
			}
		}
	}
	
	public void show() {
		for (int i = 0; i <subcount; i++) {
			System.out.println("���� �� : "+sub.get(i).getSubname()+"��� : "+sub.get(i).getRoomnum()+"ȣ");
				sub.get(i).showStu();
		}
	}
}
