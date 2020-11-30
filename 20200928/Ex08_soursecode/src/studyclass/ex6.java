package studyclass;

class Double{
	void sum(double a, double b) {System.out.println(a+b);}
	void sum(int a, int b) {System.out.println(a+b);	}
}

public class ex6 {

	public static void main(String[] args) {

		Double d = new Double();
		d.sum(1, 2);
		d.sum(1.1,2.2);
		
		
		
		
	}

}
