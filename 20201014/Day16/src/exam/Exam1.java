package exam;

public class Exam1 {
	int x=10;
	public void Exam1() {
		
	}
	int show() {
		System.out.println("show()");
		return x;
	}
	static void count() {
		int count=0;
		for(int i=1; i<51; i++) {
			if(i%3==0) {
				count++;
			}
		}
	}

	public static void main(String[] args) {
		Exam1 e = new Exam1();
		e.show();
		count();
	}
}
