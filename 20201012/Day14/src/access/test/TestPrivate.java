package access.test;

import access.sample.PrivateSample;

public class TestPrivate {

	public static void main(String[] args) {

		PrivateSample psamp = new PrivateSample();//��ü�� �������. �ν��Ͻ� �ߴ�.
		
		//psamp.num = 10;
		
		psamp.setNum(11);
		System.out.println(psamp.getNum());
		
	}

}
