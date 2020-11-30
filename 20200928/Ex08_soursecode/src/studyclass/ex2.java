package studyclass;

class Rectangle{
	int width, height;
	int area() {
		return width*height;
	}
}

public class ex2 {

	public static void main(String[] args) {

		Rectangle myRect;
		myRect = new Rectangle();
		myRect.width = 10;
		myRect.height = 20;
		System.out.println("면적은 " + myRect.area());
		
		
		
	}

}
