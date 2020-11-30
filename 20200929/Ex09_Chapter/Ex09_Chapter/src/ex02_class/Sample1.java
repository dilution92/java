package ex02_class;
class NumberBox {
	int ivalue;
	float fvalue;
}
public class Sample1 {
	public static void main(String[] args) {
		NumberBox b = new NumberBox();
		b.ivalue=10;
		b.fvalue=(float)1.2345;
		System.out.println(b.ivalue);
		System.out.println(b.fvalue);
	}
}



