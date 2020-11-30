package hanna.exarr;

import java.util.Scanner;

public class Theater {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int [] seat = new int[10];
		for(int i=1; i<= seat.length; i++) {
			seat[i-1] = 0;
		}
		for(;;) {
			System.out.println("---------------------------------------");
			System.out.println("               영화관 예매                ");
			System.out.println("---------------------------------------");
			for(int j=1; j<= seat.length; j++) {
				System.out.print(j+"   ");
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			for(int j=1; j<= seat.length; j++) {
				System.out.print(seat[j-1]+"   ");
			}
			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.print("@@@  원하시는 좌석번호를 입력하세요(종료는 -1) : ");
			
			int res = sc.nextInt();

			if (res > seat.length) {
				System.out.println("다시 입력해주세요.");
				System.out.println("");
				continue;
			}else if (res == -1) {
				System.out.println("");
				System.out.println("종료되었습니다.");
				break;
			} else if(seat[res-1] == 1){
				seat[res-1] = 0;
				System.out.println("");
				System.out.println(res+"번 좌석이 취소되었습니다.");
				System.out.println("");
			} else {
				seat[res-1] = 1;
				System.out.println("");
				System.out.println(res+"번 좌석이 선택되었습니다.");
				System.out.println("");
			}
		}
	}
}
