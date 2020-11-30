package access.test;
import access.sample.DefaultSample1; // 다른 패키지에 속한 클래스는 import 해야 사용 가능
public class TestDefault {
	public static void main(String[] args) {
		DefalutSample1 dt1 = new DefalutSample1( );
		DefaultSample2 dt2 = new DefaultSample2( );
		dt1.num1 = 100; // 다른 패키지의 클래스에서는 접근 불가능
		dt2.num2 = 100; // 같은 패키지의 클래스에서는 접근 가능
	}
}