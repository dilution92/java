package studyclass;

class Movie{
	String name, dir;
	double sco;
	int year;
	
	void print () {
		System.out.println(name+" ("+year+") "+dir+" "+sco);
	}
}


public class ex8 {

	public static void main(String[] args) {
		
		Movie m = new Movie();
		
		m.name = "KH정보교육원 일상";
		m.dir = "정희석";
		m.year = 2020;
		m.sco = 9.5;
		
		m.print();
		
		
	}

}
