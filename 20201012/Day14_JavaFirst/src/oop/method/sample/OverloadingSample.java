package oop.method.sample;
public class OverloadingSample {
	public void out ( ) {
		System.out.println ("out ( ) �޼ҵ� ����!");
	}
	public void out (int num) { // �޼ҵ� �̸��� ���� �Ű������� �ٸ���. �����ε� ����!
		System.out.println ("out (" + num + ") �޼ҵ� ����!");
	}
	// �޼ҵ� �������̵�(��Ӱ��谡 ���� ���̶��)
	// �������ڴ� ������� ����!
	public void out (int... num) {
		System.out.println("��������");
	}
}