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
		System.out.println("회원가입 페이지 입니다.");
		mem = new Member();
		while(k==0) {
			System.out.println("아이디를 입력하세요.");
			memid = sc.next();
			for (int i = 0; i < count; i++) {
				if(m.get(i).getId().equals(memid)) {
					System.out.println("이미 존재하는 ID입니다. 다시 입력하세요.");
				}else {
					mem.setId(memid);
					k=1;
				}
			}
		}

		System.out.println("비밀번호를 입력하세요.");
		mempw = sc.next();
		mem.setPassword(mempw);

		System.out.println("권한번호를 입력하세요. (일반회원은 0)");
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
		System.out.println("@@@@회원가입 완료@@@@");
	}

	public void changeAdmin() {
		int k = 0;
		while(k==0) {
			System.out.println("ID를 입력하세요.");
			memid = sc.next();
			for (int i = 0; i < m.size(); i++) {
				if(m.get(i).getId().equals(memid)) {
					System.out.println("비밀번호를 입력하세요.");
					mempw = sc.next();
					if(m.get(i).getPassword().equals(mempw)) {
						System.out.println("권한번호를 입력하세요. (일반회원은 0)");
						memad = sc.nextInt();
						if(memad == 2222) {
							m.get(i).setAdminnum(2);
						}else if(memad == 1111) {
							m.get(i).setAdminnum(1);
						}else {
							m.get(i).setAdminnum(0);
						}
						System.out.println("@@@@권한 변경 완료@@@@");
						k=1;
					}
				}
			}
		}
	}
}
