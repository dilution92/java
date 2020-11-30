package ex02_class;
class NumberBox {
	int ivalue;
	float fvalue;
	public NumberBox() {
		ivalue = 10;
		fvalue= (float)1.2345;
		print();
	}
	void print() {
		System.out.println(ivalue);
		System.out.println(fvalue);
	}
}
public class Sample1 {
	public static void main(String[] args) {
		NumberBox b = new NumberBox();
	}
}



