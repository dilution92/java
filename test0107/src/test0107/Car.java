package test0107;

public abstract class Car {
	
	public void defaultFunction() {
	}
	protected abstract void specialFunction();
	
}

class Audi extends Car{
	
	private int price;

	
	public void saveMode() {
		
	}


	@Override
	protected void specialFunction() {
		
	}
	
}

class Status {
	private int speed;
	private String engineStatus;
	private String oilStatus;
}

class Benz extends Car {
	private int price;
	
	public Status autoDrive() {
		return null;
	}

	@Override
	protected void specialFunction() {
		
	}
	
}

class Driver{
	private String name;
	private int age;
}

class BuyCar{
	private Driver bestDriver;
	private Car carType;
	
	public BuyCar(Driver d) {
		this.bestDriver =d;
		carType = new Benz();
	}
}



