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
			System.out.println("2. ȸ������");
			System.out.println("3. ȸ�����Ѻ���");
			System.out.println("4. ���α׷� ����");
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
			System.out.println("ID�� �Է��ϼ���.");
			loginid = sc.next();
			for (int i = 0; i < l.m.size(); i++) {
				if(l.m.get(i).getId().equals(loginid)) {
					System.out.println("��й�ȣ�� �Է��ϼ���.");
					loginpw = sc.next();
					if(l.m.get(i).getPassword().equals(loginpw)) {
						menu.book.admincode = l.m.get(i).getAdminnum() ; 
						menu.book.namecode = l.m.get(i).getId() ; 
						menu.menu();
						k=1;
					}
				} else {
					System.out.println("��ġ���� �ʽ��ϴ�. ID�� �ٽ� �Է��ϼ���.");
				}
			}
		}
	}
}
