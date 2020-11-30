package blogex;

public class Ex7 {

	public static void main(String[] args) {

		int num[]= {45,66,84,55,64,88,99};
		int max=0, min=100000, sum=0;
		
		for(int i=0; i<num.length; i++) {
			sum = sum + num[i];
			if(num[i]>max) {
				max=num[i];
			}
		}
		for(int i=0; i<num.length; i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println(sum-max-min);
	}
}
