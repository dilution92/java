package access.sample;
public class Child extends Parent {
	public void insert() {
		num = 10; //protected 멤버는 상속된 후손 내에서만 사용 가능함
	}
	public void out( ) {
		System.out.println(num);
	}
}