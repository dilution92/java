import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	ArrayList<Person> p = new ArrayList<>();   
	Book book = new Book();

	public Menu() {

	}
	public void menu() {
		for(;;) {
		System.out.println("----------------");
		System.out.println("(1) ���� �Է�");
		System.out.println("(2) ���� ����");
		System.out.println("(3) ���� �˻�");
		System.out.println("(4) ���� ���");
		System.out.println("(5) �α׾ƿ�");
		System.out.println("----------------");
		System.out.print("���Ͻô� �޴����� : ");
		int menu = sc.nextInt();
			if (menu ==1) {
				book.add();
			}else if (menu ==2) {
				book.modify();
			}else if (menu ==3) {
				book.search();
			}else if (menu ==4) {
				book.print();
			}else if (menu ==5) {
				return;
			}
		}
	}
}