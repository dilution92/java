package phone;

import java.util.Scanner;

public class Member {
	Scanner sc = new Scanner(System.in);
	private String id, idname;

	private int pw, rank; 
	//rank 0=일반, 1=보조, 2=관리자

	public Member() {

	}

	public String getIdname() {
		return idname;
	}

	public void setIdname(String idname) {
		this.idname = idname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPw() {
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		int res;
		if(rank == 1111) {
			res=1;
		}else if(rank == 2222) {
			res=2;
		}else {
			res=0;
		}
		this.rank = res;
	}

	public void addId() {
		System.out.println("이름을 입력하세요");
		setIdname(sc.next());
		System.out.println("생성하실 id를 입력하세요.");
		setId(sc.next());
		System.out.println("생성하실 패스워드를 입력하세요(숫자만)");
		setPw(sc.nextInt());
		System.out.println("");			
		System.out.println("관리자권한 설정 비밀번호를 입력해주세요");
		System.out.println("(일반회원은 0 입력)");
		setRank(sc.nextInt());
	}

}
