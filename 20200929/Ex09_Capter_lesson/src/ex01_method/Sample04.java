package ex01_method; 

public class Sample04 {

	public static void main(String[] args) {

		divide(4,0);
	
	}

	public static void divide(int num1, int num2) {
		
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("나눗셈결과 : "+num1 / num2);
	} 
}