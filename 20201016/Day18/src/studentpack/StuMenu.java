package studentpack;

import java.util.Scanner;

public class StuMenu {
	Scanner sc = new Scanner(System.in);
	Main main = new Main();
	int select;
	public StuMenu() {
		menu();
	}
	
	public void menu() {
		for(;;) {
			System.out.println("수업 관리 프로그램");
			System.out.println("1. 과목 추가");
			System.out.println("2. 학생 추가");
			System.out.println("3. 출력");
			select =sc.nextInt();
			
			if(select == 1) {
				main.addSub();
			}else if(select == 2) {
				main.addSubStu();
			}else if(select == 3) {
				main.show();
			}
			
		}
	}
	
}
