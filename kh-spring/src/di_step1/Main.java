package di_step1;

public class Main {
	
	
	public Main(){
		String r = null;
		
		OracleDB kim = new OracleDB();
		r = kim.findResult();
		System.out.println(r);
		
		Database park = new Database();
		r = park.select();
		System.out.println(r);
		
		MyDB lee = new MyDB();
		lee.search();
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
