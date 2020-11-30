package hanna.exarr;

public class Sample1 {

	public static void main(String[] args) {

		
		int[] test = new int[10];
		int i=0;
		for(i=1; i<= test.length; i++) {
			test[i-1] = i;
			System.out.println(i+"번째 사람의 점수는 "+test[i-1]);
		}
		
	}

}
