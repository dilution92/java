package hanna.exfor;

public class Sample6 {

	public static void main(String[] args) {

		int i=1, sum=0; // �ݺ�Ƚ���� �������� ���� ���̸� while�� ����.
		while(i<=20) {
			if(i%2==1) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
	}
}
