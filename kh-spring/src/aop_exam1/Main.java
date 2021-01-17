package aop_exam1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	
	public Main() {
		
	ApplicationContext context = 
			new FileSystemXmlApplicationContext("src/aop_exam1/aop_exam.xml");
	Advice advice = (Advice)context.getBean("advice");
	String mid = "kk";
	advice.before(mid);
	
	}

	public static void main(String[] args) {
		new Main();
	}
}
	