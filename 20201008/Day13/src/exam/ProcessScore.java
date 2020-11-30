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
		return "번 학생의 점수는 "+score;
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
			System.out.println((i+1)+"번 학생의 점수를 입력하세요 : ");
			st[i].setScore(sc.nextInt());
			total = st[i].getScore()+total;
		}

		ave=total/st.length;
		System.out.println("평균은 "+ave+"점 이다.");

		for (int i = 0; i < st.length; i++) {
			if(st[i].getScore()>=ave) {
				System.out.println((i+1)+""+st[i]+", 평균 이상이다.");
			}else {
				System.out.println((i+1)+""+st[i]+", 평균 미만이다.");
			}
		}
		sc.close();
	}
}
