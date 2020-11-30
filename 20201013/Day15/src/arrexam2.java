
public class arrexam2 {

	public static void main(String[] args) {
		int [][] a = new int[5][5];
		int sum=0;

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				a[i][j] = 5*(i)+(j+1);
			}
		}

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i%2==1) {
					sum = sum + a[i][j];
					System.out.print(a[i][j]+"\t");
				}
			}
			System.out.println();
		}
		System.out.println(sum);
	}

}
