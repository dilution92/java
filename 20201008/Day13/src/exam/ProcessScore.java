package exam;

import java.util.Scanner;

class Stud{
	int score;

	public Stud() {

	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String toString() {
		return "�� �л��� ������ "+score;
	}

}



public class ProcessScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total= 0;
		double ave;
		Stud [] st = new Stud[10];

		for(int i =0; i<st.length; i++) {
			st[i] = new Stud();
			System.out.println((i+1)+"�� �л��� ������ �Է��ϼ��� : ");
			st[i].setScore(sc.nextInt());
			total = st[i].getScore()+total;
		}

		ave=total/st.length;
		System.out.println("����� "+ave+"�� �̴�.");

		for (int i = 0; i < st.length; i++) {
			if(st[i].getScore()>=ave) {
				System.out.println((i+1)+""+st[i]+", ��� �̻��̴�.");
			}else {
				System.out.println((i+1)+""+st[i]+", ��� �̸��̴�.");
			}
		}
		sc.close();
	}
}
