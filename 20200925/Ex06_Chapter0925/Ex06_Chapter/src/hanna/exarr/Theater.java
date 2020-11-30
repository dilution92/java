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
			System.out.println("               ��ȭ�� ����                ");
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
			System.out.print("@@@  ���Ͻô� �¼���ȣ�� �Է��ϼ���(����� -1) : ");
			
			int res = sc.nextInt();

			if (res > seat.length) {
				System.out.println("�ٽ� �Է����ּ���.");
				System.out.println("");
				continue;
			}else if (res == -1) {
				System.out.println("");
				System.out.println("����Ǿ����ϴ�.");
				break;
			} else if(seat[res-1] == 1){
				seat[res-1] = 0;
				System.out.println("");
				System.out.println(res+"�� �¼��� ��ҵǾ����ϴ�.");
				System.out.println("");
			} else {
				seat[res-1] = 1;
				System.out.println("");
				System.out.println(res+"�� �¼��� ���õǾ����ϴ�.");
				System.out.println("");
			}
		}
	}
}
