package phone;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);
	Book book;
	Login login;
	int select;
	public Menu() {
		book = new Book();
	}

	public void main() {
		while(select != 5) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 전화번호부 입력");
			System.out.println("2. 전화번호부 수정");
			System.out.println("3. 전화번호부 전체보기");
			System.out.println("4. 전화번호부 찾기");
			System.out.println("5. LogOut");
			select = sc.nextInt();
			if(select ==1) {
				book.add();
			}
			if(select ==2) {
				book.modify();
			}
			if(select ==3) {
				book.print();
			}
			if(select ==4) {
				book.search();
			}
		}
	}
}
