package ex;
import java.util.Scanner;
public class Sample6 {

	public static void main(String[] args) {

		int num = 50 , i=0;

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for(i=1; i<=100; i++) {
			System.out.print(" ������ ������ ���ÿ�.(1~100) : ");
			int res = sc.nextInt();
			if(res==num) {
				System.out.println("�����մϴ�.");
				System.out.print("�õ�Ƚ�� : "+i);
				break;
			}else if (res>num){
				System.out.print("������ ������ �����ϴ�.");
			}
			else if (res<num){
				System.out.print("������ ������ �����ϴ�.");
			}	
		}
		sc.close();
	}

}
