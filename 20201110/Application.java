
public class Application {

	public static void main(String[] args) {
		
	LengthOfTwoStrings l = (String t1, String t2) -> t1.length()+t2.length();
		final int length = l.getLength("abc", "csd");
		System.out.println(length);
		
int result = get(10, 100, (a,b) ->{
		if( a>= b) {
			return b;
		}
		return a;
	});
	System.out.println(result);
	
	}
	public static int get(int a, int b, Comparator comparator) {
		return comparator.compare(a, b);
	}
}
