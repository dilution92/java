package thereaEx;

class Car extends Thread{
	private String name;
	
	public Car() {
		
	}
	
	public Car(String nm) {
		name = nm;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "�� �����ϰ� �ֽ��ϴ�.");
		}
	}
}
public class Ex1 {

	public static void main(String[] args) {
		Car car1 = new Car("1 ȣ��");
		car1.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main() �żҵ� �������Դϴ�.");
		}
	}
}
