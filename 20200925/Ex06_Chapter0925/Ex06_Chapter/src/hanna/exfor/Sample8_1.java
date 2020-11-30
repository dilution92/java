package hanna.exfor;

public class Sample8_1 {

	public static void main(String[] args) {

		int i=0, sum=0;
		
		while(sum<=100) {
			i++;
			sum = sum +i;
			System.out.println("sum : "+sum+"  i : "+i);
		}
		System.out.println(i);
		System.out.println(sum);
	}
}
