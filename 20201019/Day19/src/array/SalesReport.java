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
		System.out.println("판매원 이름을 입력하세요. >>");
		s.setName(sc.next());
		System.out.println("판매실적을 입력하세요. >>");
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
		System.out.println("평균 매출액 : "+ ave);
		System.out.println("최고 매출액 : "+ max);
		System.out.println("@@@매출왕@@@");
		System.out.println(sm.get(maxman));
	}
}
