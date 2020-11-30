package hanna.exfor;

public class Sample8 {

	public static void main(String[] args) {

		int i=1, sum=0;
		
		while(i<=50) {
			if(i%3==0) {
				sum =sum+i;
			}
			i++;
		}
		System.out.println(sum);
	}

}
