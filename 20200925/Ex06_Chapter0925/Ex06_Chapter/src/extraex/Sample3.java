package extraex;

public class Sample3 {

	public static void main(String[] args) {

		int sum = 0, count=0;
		
		for(int i=22; i<=76; i+=2) {
			sum=sum+i;
			count++;
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
