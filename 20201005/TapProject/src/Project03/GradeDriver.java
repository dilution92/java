package Project03;

import java.util.Scanner;

public class GradeDriver{
	
	public void arr() {
		Scanner sc = new Scanner(System.in);
		
		Grade[] gr = new Grade[3];
		
		for(int i=0; i<gr.length; i++) {
			gr[i] = new Grade();
			gr[i].input();
		}
		for(int i=0; i<gr.length; i++) {
			System.out.println("학생이름 : "+gr[i].name+", 점수 : "+gr[i].score);
		}
	sc.close();
	}
	
	
}


