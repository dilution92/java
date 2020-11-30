import java.util.ArrayList;
import java.util.Scanner;

class Bubblea{
	int num;
	public Bubblea() {
		
	}
}


public class Bubble {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] arr = {4,7,3,6,1};
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum+ arr[i];
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("정렬결과 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
		ArrayList <Bubblea> a= new ArrayList <Bubblea>();
		
		
		
		
	}

}
