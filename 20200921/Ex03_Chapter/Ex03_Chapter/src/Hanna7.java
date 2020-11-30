import java.util.Scanner;

public class Hanna7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오: ");
		int number = scanner.nextInt();
		if(number %3 ==0)
			System.out.println("3의 배수 입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		
		scanner.close();
		
		
	}

}
