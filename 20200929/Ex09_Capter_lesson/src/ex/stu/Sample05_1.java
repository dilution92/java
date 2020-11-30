package ex.stu; //학생 신상 정보 입출력 프로그램(1차원 배열사용-클래스분리)
import java.util.Scanner;
class Test{//멤버필드
	Scanner in = new Scanner(System.in);

	String[] name = new String[6]; //이름
	String[] age = new String[3];//나이
	String[] num = new String[11];//전화번호
	
	public Test() {//생성자 : 필수! 
		input();
	}
	void input() {//정보 입력

		for (int i = 0; i < 3; i++) {
			System.out.print("* 학생" + (i+1) +"의 이름 입력 : ");
			name[i] = in.next();

			System.out.print(name[i]+ "의 나이를 입력 : ");
			age[i] = in.next();

			System.out.print(name[i] +"의 전화번호를 입력 : ");
			num[i] = in.next();	
		}//for
		print();
	}
	void print() {//학생정보출력
		System.out.println("<학생 정보>");

		for (int i = 0; i < 3; i++) {
			System.out.print((i+1) + ". 이름 :" + name[i] + " ");
			System.out.print(", 나이 :" + age[i] +" ");
			System.out.print(", 전화번호 : " + num[i]+ "\n"); 
		}//for

	}
}
public class Sample05_1 {
	public static void main(String[] args) {
		new Test(); 
	
		/*Test t= new Test();
		t.input();
		t.print();
		*/
	}
}