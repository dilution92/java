package book;

public class Sample9 {

	public static void main(String[] args) {
		int value = 123;
		String result = (value % 2 ==0)? "Â¦¼ö": "È¦¼ö";
	//ÀÌ°É Ç®¾î¾²¸é ¹Ø°ú °°ÀÌ µÊ
		/*if(value % 2 == 0)
		{ 
			result = "Â¦¼ö";
		}else {
			result = "È¦¼ö";
		}*/
		
		System.out.println( value + "´Â " + result + "ÀÌ´Ù.");
	}

}
