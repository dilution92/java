package exam;

public class Exam {

	public static void main(String[] args) {

		int [][] a = new int[5][5];
		int sum = 0;
		for(int i=0; i<5; i++) {
			System.out.println();
			for (int j = 0; j <5; j++) {
				a[i][j] = i*5+(j+1);
				System.out.print(a[i][j]+"\t");
			}
		}
		for(int i=0; i<5; i++) {
			System.out.println();
			for (int j = 0; j <5; j++) {
				if(i%4==0 || j%4==0) {
					sum=sum+a[i][j];
					System.out.print("��"+"\s");
				}else {
					System.out.print("��"+"\s");
				}
			}
		}
//		System.out.println(sum);
		
	}

}
