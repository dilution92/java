package book;

public class Sample9 {

	public static void main(String[] args) {
		int value = 123;
		String result = (value % 2 ==0)? "¦��": "Ȧ��";
	//�̰� Ǯ��� �ذ� ���� ��
		/*if(value % 2 == 0)
		{ 
			result = "¦��";
		}else {
			result = "Ȧ��";
		}*/
		
		System.out.println( value + "�� " + result + "�̴�.");
	}

}
