package test.poly;
public class TestPolyArgument {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy (new Chair( ));
		b.buy (new Desk( ));
	}
}
class Furniture {
	private int price; //제품가격
	public Furniture (int price) {
		this.price = price;
	}
}
class Chair extends Furniture {
	public Chair() {
		super(100); // 부모 클래스의 생성자 호출
	}
	@Override
	public String toString(){
		return "Chair";
	}
}
class Desk extends Furniture {
	public Desk() {
		super(200);
	}
	@Override
	public String toString() {
		return "Desk";
	}
}

class Buyer {
	private int money = 500;
	public void buy(Furniture f){
		if (money<f.price) {
			System.out.println("잔액부족!");
			return;
		}
		money -= f.price;
		System.out.println(f+" 구매성공! 잔액: "+money+" 만원");
	}
}