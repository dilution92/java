package phone;

import java.util.Scanner;

public class Login {
	Scanner sc = new Scanner(System.in);
	String id, pw, res;
	int select, idcount;
	Member [] mem;
	Menu menu;
	public Login() {
		idcount=1;
		mem = new Member[30];
		menu = new Menu();
		mem[0] = new Member();
		mem[0].setIdname("����");
		mem[0].setId("admin");
		mem[0].setPw(1234);
		mem[0].setRank(2222);
	}

	public void pageLogin() {
		while(select !=4) {
			System.out.println("���Ͻô� �޴��� �����ϼ���.");
			System.out.println("1. ��������");
			System.out.println("2. Login");
			System.out.println("3. ����ã��");
			System.out.println("4. ���α׷�����");
			select=sc.nextInt();
			if(select == 1) {
				pageOne();
			}
			if(select == 2) {
				pageTwo();
			}
			if(select == 3) {
				pageThree();
			}

		}
	}
	public void pageOne() {
		mem[idcount].addId();
		idcount++;
	}

	public void pageTwo() {
		System.out.println("id�� �Է��ϼ���.");
		res = sc.next();
		for(int i=0; i<idcount; i++) {
			if(res.equals(mem[i].getId())) {
				System.out.println("pw�� �Է��ϼ���. ");
				int resi = sc.nextInt();
				if(resi == mem[i].getPw()) {
					menu.book.code = mem[i].getRank();
					menu.main();
				}
			}
		}

	}

	public void pageThree() {
		System.out.println("ã���� ������ �̸��� �Է��ϼ���.");
		res = sc.next();
		for(int i=0; i<idcount; i++) {
			if(res.equals(mem[i].getIdname())) {
				System.out.println("id : "+mem[i].getId());
				System.out.println("pw : "+mem[i].getPw());
			}else {
				System.out.println("ã���ô� ������ �����ϴ�.");
			}
		}
	}

	public void run() {
		pageLogin();
	}
}
