package access.test;


public class TestPublic {
	public static void main(String[] args) {
		PublicSample pbt = new PublicSample();
		pbt.num = 10; // public �̹Ƿ� ���� ����
		System.out.println( pbt.num ); // ���� ����
	}
}
