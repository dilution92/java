
public class Fibonacci_numbers {

	public static void main(String[] args) {
		System.out.println(Fibonacci(5));
		
	}

	private static int Fibonacci(int i) {
		
		return Fibonacci(i-1) + Fibonacci(i-2);
	}

}
