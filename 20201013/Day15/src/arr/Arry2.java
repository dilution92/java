package arr;

import java.util.ArrayList;

class Data{
	String name;
	int age;
	int number;
	
	public Data() {
		
	}
}



public class Arry2 {

	public static void main(String[] args) {
		ArrayList<Data> al =new ArrayList<Data>();
		Data d = new Data();
		Data d1 = new Data();
		al.add(d);
		al.add(d1);
		al.add();
		int length = al.size()	;
		for(int i=0; i<length; i++) {
			System.out.println(al.get(i).name);
		}
		System.out.println(length);
		
	}

}
