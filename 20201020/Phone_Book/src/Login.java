import java.util.*;

public class Login {
	ArrayList<Member> m ;
	Member mem;
	Scanner sc = new Scanner(System.in);
	String memid, mempw;
	int  memad, count;

	public Login() {
		m = new ArrayList<>();
		count =1;
		mem = new Member();
		mem.setId("admin");
		mem.setPassword("1234");
		mem.setAdminnum(2);
		m.add(mem);
	}

	public void addMember() {
		int k =0;
		System.out.println("ȸ������ ������ �Դϴ�.");
		mem = new Member();
		while(k==0) {
			System.out.println("���̵� �Է��ϼ���.");
			memid = sc.next();
			for (int i = 0; i < count; i++) {
				if(m.get(i).getId().equals(memid)) {
					System.out.println("�̹� �����ϴ� ID�Դϴ�. �ٽ� �Է��ϼ���.");
				}else {
					mem.setId(memid);
					k=1;
				}
			}
		}

		System.out.println("��й�ȣ�� �Է��ϼ���.");
		mempw = sc.next();
		mem.setPassword(mempw);

		System.out.println("���ѹ�ȣ�� �Է��ϼ���. (�Ϲ�ȸ���� 0)");
		memad = sc.nextInt();
		if(memad == 2222) {
			mem.setAdminnum(2);
		}else if(memad == 1111) {
			mem.setAdminnum(1);
		}else {
			mem.setAdminnum(0);
		}
		m.add(mem);
		count++;
		System.out.println("@@@@ȸ������ �Ϸ�@@@@");
	}

	public void changeAdmin() {
		int k = 0;
		while(k==0) {
			System.out.println("ID�� �Է��ϼ���.");
			memid = sc.next();
			for (int i = 0; i < m.size(); i++) {
				if(m.get(i).getId().equals(memid)) {
					System.out.println("��й�ȣ�� �Է��ϼ���.");
					mempw = sc.next();
					if(m.get(i).getPassword().equals(mempw)) {
						System.out.println("���ѹ�ȣ�� �Է��ϼ���. (�Ϲ�ȸ���� 0)");
						memad = sc.nextInt();
						if(memad == 2222) {
							m.get(i).setAdminnum(2);
						}else if(memad == 1111) {
							m.get(i).setAdminnum(1);
						}else {
							m.get(i).setAdminnum(0);
						}
						System.out.println("@@@@���� ���� �Ϸ�@@@@");
						k=1;
					}
				}
			}
		}
	}
}
