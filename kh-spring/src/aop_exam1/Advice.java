package aop_exam1;

public class Advice implements Log{

	Dao dao;
	
	public Advice(Dao dao) {
		this.dao = dao;
	}
	
	@Override
	public void logincheck(String mid) {
		if(mid == null) {
			System.out.println("로그인 필요");
		}else {
			System.out.println("로그인 성공");
		}
	}
	
	public void before(String mid) {
		logincheck(mid);
		dao.select();
		
	}
}
