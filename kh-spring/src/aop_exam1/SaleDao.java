package aop_exam1;

public class SaleDao implements Dao {

	
	public SaleDao() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void select() {
		System.out.println("Sale select ok ....");
	}
}
