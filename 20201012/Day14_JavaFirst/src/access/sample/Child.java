package access.sample;
public class Child extends Parent {
	public void insert() {
		num = 10; //protected ����� ��ӵ� �ļ� �������� ��� ������
	}
	public void out( ) {
		System.out.println(num);
	}
}