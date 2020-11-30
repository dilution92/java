package practice;

public class OverLoadingExam {

	int color;
	String strColor;
	
	public OverLoadingExam() {
		
	}
	
	void setColor(int color) {
		this.color = color;
	}
	void setColor(String color) {
		strColor = color;
	}
	
	public String toString() {
		return "ÄÃ·¯ : " + color + ", " + strColor;
	}
	
	public static void main(String[] args) {
		OverLoadingExam o = new OverLoadingExam();
		o.setColor(20);
		o.setColor("Red");
		System.out.println(o);
	}
}
