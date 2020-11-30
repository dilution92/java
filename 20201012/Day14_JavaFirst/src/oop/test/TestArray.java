package oop.test;
import oop.sample. Person;
public class TestArray {
	public static void main(String[] args) {
		Person[] list = new Person[3]; // 3¸íÀ» º¸°üÇÒ ¼ö ÀÖ´Â °´Ã¼¹è¿­ ¼±¾ð
		list[0]=new Person("±è°³¶Ë", 19, '³²');
		list[1]=new Person("±è¸»¶Ë", 20, '³²');
		list[2]=new Person("±è¼Ò¶Ë", 22, '¿©');
		
		
		Person[] list1 = {new Person("±è°³¶Ë", 19, '³²'), 
			 new Person("±è¸»¶Ë", 20, '³²')};
	//	°¢ °´Ã¼ÀÇ ¸â¹ö¿¡ Á¢±Ù ÀÌ¸§Ãâ·Â
		for(int i=0; i<list.length;i++){
			System.out.println(list[i].getName());
		}
	}
}