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
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1. ��ȭ��ȣ�� �Է�");
			System.out.println("2. ��ȭ��ȣ�� ����");
			System.out.println("3. ��ȭ��ȣ�� ��ü����");
			System.out.println("4. ��ȭ��ȣ�� ã��");
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
