package studyclass;

class Date{
	int year, month1, day;
	String month2;
	 void print1() {
		System.out.println(year+"."+month1+"."+day);
	}
	 void print2() {
			System.out.println(month2+" "+day+", "+year);
	 }
}

public class ex7 {

	public static void main(String[] args) {

		Date d = new Date();
		d.year = 2020;
		d.month1 = 9;
		d.month2 = "September";
		d.day = 28;
		
		d.print1();
		d.print2();
	}
}
