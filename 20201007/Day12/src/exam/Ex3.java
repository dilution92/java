package exam;

public class Ex3 {

	public static void main(String[] args) {

		for(int i=5; i>0; i--) {
			for(int j=1; j<6; j++) {
				if(i>=j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
