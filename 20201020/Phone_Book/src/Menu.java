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
		System.out.println("(1) 정보 입력");
		System.out.println("(2) 정보 수정");
		System.out.println("(3) 정보 검색");
		System.out.println("(4) 정보 출력");
		System.out.println("(5) 로그아웃");
		System.out.println("----------------");
		System.out.print("원하시는 메뉴선택 : ");
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