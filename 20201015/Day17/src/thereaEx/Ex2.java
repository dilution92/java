package thereaEx;

class Car1 extends Thread{
	private String name;
	
	public Car1() {
		
	}
	public Car1(String nm) {
		name = nm;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(1000);
				System.out.println(name + "�� �����ϰ� �ֽ��ϴ�.");
			}catch(InterruptedException e) {
				
			}
		}
	}
}
public class Ex2 {

	public static void main(String[] args) {
		Car1 car1 = new Car1("1 ȣ��");
		car1.start();
		
		for (int i = 0; i <5; i++) {
			System.out.println("main() �żҵ� �������Դϴ�.");
		}
	}
}
