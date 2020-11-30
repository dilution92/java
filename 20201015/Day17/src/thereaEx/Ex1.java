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
			System.out.println(name + "가 동작하고 있습니다.");
		}
	}
}
public class Ex1 {

	public static void main(String[] args) {
		Car car1 = new Car("1 호차");
		car1.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main() 매소드 실행중입니다.");
		}
	}
}
