package array;

import java.util.*;

public class SalesReport {
	Scanner sc = new Scanner(System.in);
	ArrayList <Salesman> sm;
	int mannum, max, ave, maxman;
	
	public SalesReport() {
		sm = new ArrayList<Salesman>();
		mannum=0;
		max=0;
		ave=0;
	}
	
	public void add() {
		Salesman s = new Salesman();
		System.out.println("�Ǹſ� �̸��� �Է��ϼ���. >>");
		s.setName(sc.next());
		System.out.println("�ǸŽ����� �Է��ϼ���. >>");
		s.setSale(sc.nextInt());
		sm.add(s);
		mannum++;
	}
	public void cal() {
		int t=0;
		for (int i = 0; i < mannum; i++) {
			t = t+sm.get(i).getSale();
			if(sm.get(i).getSale()>max) {
				max = sm.get(i).getSale();
				maxman = i;
			}
		}
		ave = t/mannum;
	}
	public void print() {
		System.out.println("��� ����� : "+ ave);
		System.out.println("�ְ� ����� : "+ max);
		System.out.println("@@@�����@@@");
		System.out.println(sm.get(maxman));
	}
}
