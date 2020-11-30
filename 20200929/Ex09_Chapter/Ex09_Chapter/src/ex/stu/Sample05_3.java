package ex.stu; //학생 신상 정보 입출력 프로그램(2차원 배열사용+클래스분리)
import java.util.Scanner;

class ccc{//멤버필드
	Scanner in = new Scanner(System.in);

	String[][] arr = new String[3][3];
	
	public ccc() {//생성자 필수!!
		input();
	}
	void input() {//정보입력
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print("* 학생 " + (i+1) + "의 이름 입력 : ");
			arr[i][0] = in.next();

			System.out.print(arr[i][0] + "의 나이 입력 : ");
			arr[i][1] = in.next();

			System.out.print(arr[i][0]+ "의 전화번호 입력 : ");
			arr[i][2] = in.next();
		}//for
		print();
	}
	void print() {//정보출력
		System.out.println("<학생 정보>");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+ ". 이름 : " + arr[i][0]);
			System.out.print(", 나이 : " + arr[i][1]);
			System.out.print(", 전화번호 : " + arr[i][2]);
			System.out.println(" ");
		}//for
		search();
	}
	void search() { //정보 검색
		for(;;) {
			System.out.print("찾으시는 학생의 나이 : ");
			String a = in.next();

			for (int i = 0; i < arr.length; i++) {
				if (a.equals(arr[i][1])) {
					System.out.println("이름 : " + arr[i][0] + ", 나이 : " + arr[i][1]+", 전화번호 : " + arr[i][2]);
					System.out.println("프로그램을 종료합니다");
					return;
				}
			}//for
			System.out.println("결과가 없습니다. 다시 입력해주세요");	
		}
	}
}
public class Sample05_3 {
	public static void main(String[] args) 
	{
		new ccc();
	}
}