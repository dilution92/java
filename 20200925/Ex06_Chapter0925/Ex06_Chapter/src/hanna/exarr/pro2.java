package hanna.exarr;
import java.io.*;
public class pro2 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 3;
		int select=0;
		String [] name = new String[num];
		String [] age = new String[num];
		String [] call = new String[num];
		
		while(select != 4) {
			System.out.println("-----�޴�-----");
			System.out.println("1. �л������Է�");
			System.out.println("2. �л��������");
			System.out.println("3. �л������˻�");
			System.out.println("4. ���α׷� ����");
			System.out.println("-------------");
			String res = br.readLine();
			select = Integer.parseInt(res);

			switch (select){

			case 1 :
				for(int i=1; i<=num; i++) {
					System.out.println("�л� ������ �Է��ϼ��� (�̸� ���� ��ȭ��ȣ)");
					name[i-1] = br.readLine();
					age[i-1] = br.readLine();
					call[i-1] = br.readLine();
					System.out.println("�Է� �Ϸ�!");
					System.out.println("");
				} break;

			case 2 :
				System.out.println(" �� �� �� �� �� ��");
				System.out.println("--------------------------------------");
				for(int i=1; i<=num; i++) {
					System.out.println(name[i-1]+"  "+age[i-1]+"  "+call[i-1]);
				}
				System.out.println("--------------------------------------");
				break;

			case 3 :
				System.out.println("�л� ���̸� �Է����ּ���.(����� n) : ");
				String res1 = br.readLine();
				
				for(int i=1; i<=num; i++) {
					
					if(res1.equals(age[i-1])) {
						System.out.println(name[i-1]+"  "+age[i-1]+"  "+call[i-1]);
						continue;
					}
					else if(res1.equals("n")) {
						System.out.println("�˻��� �����մϴ�.");
						break;
					}
				} break;
				
			case 4 : 
				System.out.println("���α׷��� �����մϴ�.");
				break;
				
				default :
				System.out.println("�ٽ� �Է��� �ּ���.");
			}
		}
	}
}
