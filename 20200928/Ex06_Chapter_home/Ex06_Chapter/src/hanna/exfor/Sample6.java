package hanna.exfor;

public class Sample6 {

	public static void main(String[] args) {

		int i=1, sum=0; // 반복횟수가 정해지지 않은 것이면 while을 쓴다.
		while(i<=20) {
			if(i%2==1) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
