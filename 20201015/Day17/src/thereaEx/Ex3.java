package thereaEx;
public class Ex3 {

	public static void main(String[] args) {
		Car car1 = new Car("1 ȣ��");
		car1.start();
		
		Car car2 = new Car("2 ȣ��");
		car2.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main() �żҵ� �������Դϴ�.");
		}
	}
}
