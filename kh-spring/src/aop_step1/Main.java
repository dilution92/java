package aop_step1;

public class Main {
	
	public Main() {
		BoardDao bDao = new BoardDao();
		SaleDao sDao = new SaleDao();
		MemberDao mDao = new MemberDao();
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
