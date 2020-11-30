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
		System.out.println("즐거운 주사위 게임");
		for(;;) {
			System.out.println("1. Player Setting");
			System.out.println("2. Play Game");
			System.out.println("3. Bye Bye~");
			res = sc.nextInt();

			if(res ==1) {
				for(int i=0; i<2; i++) {
					p[i] = new Player();
					System.out.println((i+1)+"번 플레이어를 입력하세요.");
					p[i].setName(sc.next());
					p[i].setNum((i+1));
				}
			}
			if(res ==2) {
				System.out.println(count+" 번째 게임을 시작합니다.");
				for (int i = 0; i < p.length; i++) {
					p[i].d.Play();
					System.out.println(p[i]+" 주사위 합계는 "+p[i].d.getSum());
				}
				if(p[0].d.getSum()>p[1].d.getSum()) {
					System.out.println(p[0]+"가 이겼습니다.");
				}
				if(p[0].d.getSum()<p[1].d.getSum()) {
					System.out.println(p[1]+"가 이겼습니다.");
				}
				if(p[0].d.getSum()==p[1].d.getSum()) {
					System.out.println("두 플레이어가 비겼습니다.");
				}
				count++;
			}
			if(res ==3) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
		}
	}
}
