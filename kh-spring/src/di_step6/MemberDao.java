package di_step6;

public class MemberDao {
	DB db;
	
	public MemberDao() {}
	//생성자를 통한 주입.
	public MemberDao(DB db) {
		this.db = db;
		System.out.println(db.select(""));
	}

	public DB getDb() {
		return db;
	}

	public void setDb(DB db) {
		this.db = db;
		System.out.println("메서드를 통해 주입 받음.......");
	}
	
	
}
