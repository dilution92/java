package phone;

import java.util.Scanner;

public class Member {
	Scanner sc = new Scanner(System.in);
	private String id, idname;

	private int pw, rank; 
	//rank 0=�Ϲ�, 1=����, 2=������

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
		System.out.println("�̸��� �Է��ϼ���");
		setIdname(sc.next());
		System.out.println("�����Ͻ� id�� �Է��ϼ���.");
		setId(sc.next());
		System.out.println("�����Ͻ� �н����带 �Է��ϼ���(���ڸ�)");
		setPw(sc.nextInt());
		System.out.println("");			
		System.out.println("�����ڱ��� ���� ��й�ȣ�� �Է����ּ���");
		System.out.println("(�Ϲ�ȸ���� 0 �Է�)");
		setRank(sc.nextInt());
	}

}
