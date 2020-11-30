package Project01;

import java.util.Scanner;

class Stu {
	Scanner sc = new Scanner(System.in);
	String [] name = new String[3];
	int [] sco = new int[3];
	
	void set() {
		for(int i = 0; i<name.length; i++) {
			System.out.println("학생 이름을 입력해주세요. >>");
			name[i] =sc.next();
		}
		for(int i = 0; i<name.length; i++) {
			System.out.println(name[i]+"학생 성적을 입력해주세요. >>");
			sco[i] = sc.nextInt();
		}
	}
	void print() {
		for(int i = 0; i<name.length; i++) {
			System.out.println("학생이름 : "+name[i]+" 성적 : "+sco[i]);
		}
	}
		}
/*1. 3명의 학생정보 입출력 시스템을 완성하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점) 
 * 출력 : 입력된 정보 출력 
 * 학습정보 : 대입연산자, 변수, 출력
 */
public class Pro01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stu  s = new Stu();
		s.set();
		s.print();

		sc.close();
	}
}