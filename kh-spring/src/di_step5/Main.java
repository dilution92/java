package di_step5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import di_step4.DB;

public class Main {

	
	
	public static void main(String[] args) {
		ApplicationContext context = 
				new FileSystemXmlApplicationContext("src/di_step5/di_step5.xml");
		
		MemberDao dao = context.getBean("dao", MemberDao.class); // or dao = (MemberDao)context.getBean("dao");
	}
}
