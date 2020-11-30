package arr;
import java.util.ArrayList;

public class Arry1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("gemini");
		al.add("johnharu");
		al.add(new Integer(10));
		System.out.println("Array List ∞¥√º"+al);
		
		int length = al.size();
		System.out.println("Array List ±Ê¿Ã"+length);
		
		for(int i=0; i<length; i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println(al.get(2));
		
	}

}
