package array;

public class Salesman {
	String name;
	int sale;
	
	public Salesman() {
		sale = 0;
	}
	
	public Salesman(String a, int b) {
		name =a;
		sale =b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	@Override
	public String toString() {
		return "이름 : "+name+", 매출 : "+sale   ;
	}
	
}
