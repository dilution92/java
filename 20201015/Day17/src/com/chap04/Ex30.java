package com.chap04;

public class Ex30 {

	public static void main(String[] args) {
		Data d = new Data();
//		d.name = "Èñ¼®ÀÌ Â¯Â¯¸Ç";
//		d.print();
//		d.age=33;
//		d.name="ÃÊ±â°ª";
//		d.print();
		Data d1 = new Data("Èñ¼®Â¯Â¯¸Ç");
		d1.print();
		Data d2 = new Data(33);
		d2.print();
	}

}
