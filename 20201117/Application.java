import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(5, 3, 8, 4, 9, 1, 6, 2, 7);
        System.out.println(list);
        final List<Integer> sorted = Quicksort.sort(list);
        System.out.println(sorted);

//		System.out.println(factorial(5));
//		
//	}
//	/*
//	 * @param
//	 * @
//	 * */
//	private static int factorial(int i) {
//		if (i ==1) {
//			return 1;
//		}
//		return i * factorial(i-1);
	}

}
