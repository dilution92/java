package hanna.exarr;
import java.io.*;
public class pro2 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(;;) {
			System.out.println("�޴�");
			System.out.println("1. �л������Է�");
			System.out.println("2. �л��������");
			System.out.println("3. ���α׷� ����");
			
			
			
			int num = 3;
			String [] name = new String[num];
			String [] age = new String[num];
			String [] call = new String[num];

			for(int i=1; i<=num; i++) {
				System.out.println("�л� ������ �Է��ϼ��� (�̸� ���� ��ȭ��ȣ)");
				name[i-1] = br.readLine();
				age[i-1] = br.readLine();
				call[i-1] = br.readLine();
			}
			System.out.println(" �� �� �� �� �� ��");
			System.out.println("--------------------------------------");
			for(int i=1; i<=num; i++) {
				System.out.println(name[i-1]+"  "+age[i-1]+"  "+call[i-1]);
			}
			System.out.println("--------------------------------------");

			for(int i=1; i<=num; i++) {
				System.out.println("�л� ���̸� �Է����ּ���.(����� n) : ");
				String res1 = br.readLine();

				if(res1 == age[i-1]) {
					System.out.println(name[i-1]+"  "+age[i-1]+"  "+call[i-1]);
				}else if(res1 == "n") {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}else {
					System.out.println("�˻���� ����");
					i--;
				}
			}
		}
	}
}