package dice;

import java.util.Scanner;

public class Driver {
	Scanner sc = new Scanner(System.in);
	int res, count;
	Player [] p;

	public Driver() {
		p = new Player[2];
		count=1;
		Menu();
	}

	public void Menu() {
		System.out.println("��ſ� �ֻ��� ����");
		for(;;) {
			System.out.println("1. Player Setting");
			System.out.println("2. Play Game");
			System.out.println("3. Bye Bye~");
			res = sc.nextInt();

			if(res ==1) {
				for(int i=0; i<2; i++) {
					p[i] = new Player();
					System.out.println((i+1)+"�� �÷��̾ �Է��ϼ���.");
					p[i].setName(sc.next());
					p[i].setNum((i+1));
				}
			}
			if(res ==2) {
				System.out.println(count+" ��° ������ �����մϴ�.");
				for (int i = 0; i < p.length; i++) {
					p[i].d.Play();
					System.out.println(p[i]+" �ֻ��� �հ�� "+p[i].d.getSum());
				}
				if(p[0].d.getSum()>p[1].d.getSum()) {
					System.out.println(p[0]+"�� �̰���ϴ�.");
				}
				if(p[0].d.getSum()<p[1].d.getSum()) {
					System.out.println(p[1]+"�� �̰���ϴ�.");
				}
				if(p[0].d.getSum()==p[1].d.getSum()) {
					System.out.println("�� �÷��̾ �����ϴ�.");
				}
				count++;
			}
			if(res ==3) {
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
			}
		}
	}
}
