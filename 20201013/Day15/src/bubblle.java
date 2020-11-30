import java.util.Scanner;

class a{
	public a() {
		
	}
}

public class bubblle {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {4,7,3,6,1};
		int sum = 0;
		
		for (int i =0; i<arr.length; i++) {
			sum = arr[i]+sum;
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("정렬결과 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
		System.out.println("\n입력한 수의 총 합은 : "+sum);
	}
}
