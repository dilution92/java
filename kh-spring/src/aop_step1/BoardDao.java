package aop_step1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardDao implements Log{
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd(E) hh:mm:ss:SS");
	
	public BoardDao () {
		System.out.println(logOut());
	}
	
	@Override
	public String logOut() {
		String r = sdf.format(new Date());
		return r;
	}

}
