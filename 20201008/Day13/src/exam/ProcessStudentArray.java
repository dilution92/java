package exam;

import java.util.Scanner;

public class ProcessStudentArray {

	public static void main(String[] args) {

		Student13 [] st = new Student13[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<st.length; i++) {
			System.out.print("학생의 이름을 입력하세요. : ");
			st[i] = new Student13(sc.next());
			System.out.print("학생의 학번의 입력하세요. : ");
			st[i].setNumber(sc.nextInt());
		}
		
		System.out.println("학번"+"\t"+"이름");
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i].getNumber()+"\t"+st[i].getName());
		}
		
	}

}
