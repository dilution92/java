package di_anno;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberDao {
	DB db;
	
	public MemberDao() {
		System.out.println("생성자 실행");
	}
	
	public MemberDao(DB db) {
		System.out.println("@autowired로 자동 주입 받음");
		this.db = db;
	}

	public DB getDb() {
		return db;
	}

	public void setDb(DB db) {
		this.db = db;
		System.out.println("메서드를 통해 주입 받음.......");
	}
	
	
}
