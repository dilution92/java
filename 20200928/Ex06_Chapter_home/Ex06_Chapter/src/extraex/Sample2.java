package extraex;

public class Sample2 {

	public static void main(String[] args) {

		
		int i=0, sum=0;
		for(i=1; i<=100; i++) {
			sum = sum+i;
			if (i%10==0) {
				System.out.println("1 ~ "+i+"까지의 합 -> "+sum);
			}
		}
	}
}
