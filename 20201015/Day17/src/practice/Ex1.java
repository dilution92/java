package practice;

class Bicycle{
	int id;
	String brand;
	
	public Bicycle() {
		
	}
	
	public Bicycle(int id, String brand) {
		this.id = id;
		this.brand = brand;
	}
}

public class Ex1 extends Bicycle{
	int wheelSize;
	
	public void pritInfo() {
		System.out.println("brand : "+brand);
		System.out.println("wheelSize : "+wheelSize);
	}
	public Ex1(int id, String brand) {
		super.id = id;
		super.brand = brand;
	}
	public static void main(String[] args) {
		Ex1 mv = new Ex1(20051889,"hanna");
		mv.wheelSize = 20;
		mv.pritInfo();
	}
}
