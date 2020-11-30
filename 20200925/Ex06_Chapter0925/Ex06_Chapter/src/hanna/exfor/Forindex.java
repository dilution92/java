package hanna.exfor;

public class Forindex {

	public static void main(String[] args) {


		int []a= {5,9,3};
		int max = 0;
		int maxindex = 0;
		for(int i=0; i<a.length; i++){
			if(a[i]>max) {
				max=a[i];
				maxindex = i+1;
			}
		}
		System.out.println(maxindex);
	}
}
