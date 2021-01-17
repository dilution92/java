package aop_step2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardDao implements Dao{
	
	public BoardDao () {
		System.out.println(select());
		System.out.println(insert());
	}
	
	@Override
	public List<String> select() {
		List<String> list = new ArrayList<>();
		String str = "BoardDao 실행";
		list.add(str);
		return list;
	}

	@Override
	public String insert() {
		
		return "BoardDoa insert 실행";
	}

	@Override
	public String update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String repl() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
