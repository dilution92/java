package array;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	SalesReport sr;
	int select;
	public Menu() {
		sr = new SalesReport();
		Main();
	}

	public void Main() {
		for(;;) {
			System.out.println("1. �Ǹſ��Է�");
			System.out.println("2. ���");
			System.out.println("3. ���α׷� ����");
			select = sc.nextInt();
			if(select == 1) {
				pageOne();
			}
			if(select == 2) {
				pageTwo();
			}
			if(select == 3) {
				break;
			}
		}
	}
	public void pageOne() {
		sr.add();
	}
	public void pageTwo() {
		sr.cal();
		sr.print();
	}
}
