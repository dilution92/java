package com.ex01;

public class Data {
	
	String name;
	int age;
	
	public Data() {
		System.out.println("Data ������ ����");
	}
	
	public static void main(String[] arge) {
		Data[]	d = new Data[3];
		Data[] data = new Data[3];
		
		data = d;
		
		for(int i = 0; i<d.length; i++) {
			d[i] = new Data();
			d[i].name ="��";
			d[i].age = 29;
			System.out.println(d[0].name + " , "+ d[0].age);
		}
		
		/*d[0] = new Data();
		d[0].name = "����";
		d[0].age = 29;
		
		d[0] = new Data();
		d[1].name = "������";
		d[1].age = 29;
		System.out.println(d[0].name + " , "+ d[0].age);*/
	}
	
	
}
