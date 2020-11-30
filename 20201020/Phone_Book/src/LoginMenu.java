import java.util.*;

public class LoginMenu {
	Login l;
	Menu menu;
	Scanner sc  = new Scanner(System.in);
	String loginid, loginpw;
	int select;

	public LoginMenu() {
		l = new Login();
		menu = new Menu();
		select = 0;
		pageMain();
	}
	
	public void pageMain() {
		for(;;) {
			System.out.println("1. Login");
			System.out.println("2. 회원가입");
			System.out.println("3. 회원권한변경");
			System.out.println("4. 프로그램 종료");
			select = sc.nextInt();
			if(select ==1 ) {
				pageOne();
				select = 0;
			}
			if(select ==2 ) {
				l.addMember();
			}
			if(select ==3 ) {
				l.changeAdmin();
			}
			if(select ==4 ) {
				break;
			}
		}
	}

	public void pageOne() {
		int k = 0;
		while(k==0) {
			System.out.println("ID를 입력하세요.");
			loginid = sc.next();
			for (int i = 0; i < l.m.size(); i++) {
				if(l.m.get(i).getId().equals(loginid)) {
					System.out.println("비밀번호를 입력하세요.");
					loginpw = sc.next();
					if(l.m.get(i).getPassword().equals(loginpw)) {
						menu.book.admincode = l.m.get(i).getAdminnum() ; 
						menu.book.namecode = l.m.get(i).getId() ; 
						menu.menu();
						k=1;
					}
				} else {
					System.out.println("일치하지 않습니다. ID를 다시 입력하세요.");
				}
			}
		}
	}
}
