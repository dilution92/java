package access.test;

import access.sample.PrivateSample;

public class TestPrivate {
	public static void main(String[] args) {
		PrivateSample psamp = new PrivateSample();
		//psamp.num = 10; // private �̹Ƿ� ���� ���� ���� �߻�
		psamp.setNum( 10 ); // public �̹Ƿ� ���� ����
		System.out.println( psamp.getNum( ) ); // public �̹Ƿ� ���� ����
	}
}
