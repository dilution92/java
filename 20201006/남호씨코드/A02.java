
import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {
		A00[] a = new A00[3];

		Scanner sc = new Scanner(System.in);
		System.out.println("1.학생 정보 입력");
		System.out.println("2.입력된 정보 출력");
		System.out.println("3.프로그램 종료");

		System.out.println();
		while(true) {
			System.out.print("메뉴 번호를 입력해주세요 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1 : System.out.println("1.학생 정보 입력");
			for(int i = 0; i < a.length; i++) {
				a[i] = new A00();
				System.out.println((i+1) + "번째 학생의 이름을 입력해주세요 : ");
				a[i].name = sc.next();
				System.out.println((i+1) + "번째 학생의 나이를 입력해주세요 : ");
				a[i].age = sc.nextInt();
				System.out.println((i+1) + "번째 학생의 번호를 입력해주세요 : ");
				a[i].number = sc.next();
			}
			break;
			case 2 : System.out.println("2.입력된 정보 출력");
			System.out.println("1번째 학생의 이름 : " + a[0].name + ", 나이 : " + a[0].age + ", 번호 : " + a[0].number);
			System.out.println("2번째 학생의 이름 : " + a[1].name + ", 나이 : " + a[1].age + ", 번호 : " + a[1].number);
			System.out.println("3번째 학생의 이름 : " + a[2].name + ", 나이 : " + a[2].age + ", 번호 : " + a[2].number);
			break;
			case 3 : System.out.println("3.프로그램 종료");
			break;
			default : System.out.println("잘못 입력하셧습니다. 다시 입력해주세요.");
			sc.close();
			break;
			}
			if(num == 3) {
				break;
			}
		}
	}
}