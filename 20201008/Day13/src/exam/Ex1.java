package exam;

public class Ex1 {
	
	static int divi(int a, int b) {
		return a/b;
	}
	static double divi(double a, double b) {
		return a/b;
	}

	public static void main(String[] args) {

		int result1 = divi(10,4);
		double result2 = divi(10.0, 4.0);
		
		System.out.println("정수형 나누기 결과 : "+result1);
		System.out.println("실수형 나누기 결과 : "+result2);
	}
}
