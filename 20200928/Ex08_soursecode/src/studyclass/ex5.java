package studyclass;

class Num{
	public Num() {
		int a, b, c;
		
	}
	public void Num(int a, int b) {
		System.out.println(a+b);
	}
	public void Num(int a, int b, int c) {
		System.out.println(a+b+c);
	}
}

public class ex5 {

	public static void main(String[] args) {

		Num n = new Num();
		n.Num(10,20);
		n.Num(10, 20,30);
	}

}
