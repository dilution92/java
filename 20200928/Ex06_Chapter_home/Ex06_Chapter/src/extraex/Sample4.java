package extraex;

public class Sample4 {

	public static void main(String[] args) {

		
		for(int i =2; i<=100; i+=2) {
			System.out.printf("%4d",i);
			if(i%20==0) {
				System.out.println("");
			}
		}
	}

}
