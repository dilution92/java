package exam;

import java.util.Scanner;

class Freq{
	int num;
	public Freq() {
		
	}
}

public class EX4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Freq [] f = new Freq[3];
		
		for(int i=0; i<f.length; i++) {
			System.out.println("정수를 입력하세요.");
			f[i] = new Freq();
			f[i].num = sc.nextInt();
		}
		for(int i=1; i<101; i++) {
			if(i%10==1) {
				System.out.print("\n"+i+"~"+(i+9));
			}
			for(int j=0; j<f.length; j++) {
				if(f[j].num == i) {
					System.out.print("*");
				}
			}
		}
		
		
		sc.close();
	}

}
