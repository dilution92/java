package access.test;

import access.sample.PrivateSample;

public class TestPrivate {

	public static void main(String[] args) {

		PrivateSample psamp = new PrivateSample();//객체를 만들었다. 인스턴스 했다.
		
		//psamp.num = 10;
		
		psamp.setNum(11);
		System.out.println(psamp.getNum());
		
	}

}
