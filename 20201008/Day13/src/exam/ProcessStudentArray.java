package exam;

import java.util.Scanner;

public class ProcessStudentArray {

	public static void main(String[] args) {

		Student13 [] st = new Student13[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<st.length; i++) {
			System.out.print("�л��� �̸��� �Է��ϼ���. : ");
			st[i] = new Student13(sc.next());
			System.out.print("�л��� �й��� �Է��ϼ���. : ");
			st[i].setNumber(sc.nextInt());
		}
		
		System.out.println("�й�"+"\t"+"�̸�");
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i].getNumber()+"\t"+st[i].getName());
		}
		
	}

}
