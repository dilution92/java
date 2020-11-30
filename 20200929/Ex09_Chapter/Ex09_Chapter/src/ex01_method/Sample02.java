package ex01_method; 
public class Sample02 {

	public static void main(String[] args) {
		double myHeight = 175.9;

		//여기에 코드를 삽입해주세요.

		byEveryone();
	}

	public static void hiEveryone(int age, double height) {
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("저의 키는 " + height + "cm 입니다.");
	}

	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}
}