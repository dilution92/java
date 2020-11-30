package hanna.exarr;
import java.io.*;
public class Phonebook {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 3;
		String select = "0";
		String [] name =new String [num+1];
		String [] phone =new String [num+1];
		String [] age =new String [num+1];
		String [] address =new String [num+1];
		int [] count =new int[num+1];
		int maxcount1 = 0;
		int select1 = 0;

		while(select1 != 6) {
			System.out.println("-------------");
			System.out.println("메뉴");
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 검색");
			System.out.println("4. 수정");
			System.out.println("5. 삭제");
			System.out.println("6. 종료");
			System.out.println("-------------");
			System.out.println("원하시는 메뉴를 선택하세요 : ");
			select = br.readLine();
			select1 = Integer.parseInt(select);

			switch(select1){
			case 1 :
				if(maxcount1 == 0) {
					for(int i=maxcount1; i<num; i++) {
						System.out.println("이름 나이 전화번호 주소를 입력하세요.");
						name[i]=br.readLine();
						age[i]=br.readLine();
						phone[i]=br.readLine();
						address[i]=br.readLine();
						count[i] = i+1;
						maxcount1 =1;
					}
				}else {
					System.out.println("전화번호부 입력");
					for(int i=0; i<num; i++) {
						if(count[i]>maxcount1) {
							maxcount1 = count[i];
						}
					}
					for(int i=maxcount1; i<num; i++) {
						System.out.println("이름 나이 전화번호 주소를 입력하세요.");
						name[i]=br.readLine();
						age[i]=br.readLine();
						phone[i]=br.readLine();
						address[i]=br.readLine();
						count[i] = i+1;

					}
				}
				break;

			case 2 :
				System.out.println("번호\t이름\t나이\t전화번호\t\t주소\t\t\t");
				for(int i=0; i<num; i++) {
					System.out.println(count[i]+"\t"+name[i]+"\t"+age[i]+"\t"+phone[i]+"\t\t"+address[i]);
				}
				break;

			case 3 :
				System.out.println("검색하실 번호 입력 : ");
				String res = br.readLine();
				int pick = Integer.parseInt(res);
				for(int i =0; i<num; i++) {
					if(count[i]==pick) {
						System.out.println("번호\t이름\t나이\t전화번호\t\t주소\t\t\t");
						System.out.println(count[i]+"\t"+name[i]+"\t"+age[i]+"\t"+phone[i]+"\t\t"+address[i]);
						System.out.println();
					}
				}
				break;

			case 4 :
				System.out.println("수정하실 번호 입력 : ");
				String res1 = br.readLine();
				int pick1 = Integer.parseInt(res1);
				for(int i =0; i<num; i++) {
					if(count[i]==pick1) {
						System.out.println("번호\t이름\t나이\t전화번호\t\t주소\t\t\t");
						System.out.println(count[i]+"\t"+name[i]+"\t"+age[i]+"\t"+phone[i]+"\t\t"+address[i]);
						System.out.println();
						System.out.println("수정하실 내용이 맞습니까? (y or n)");
						res = br.readLine();
						if(res.equals("y")) {
							System.out.println("이름 나이 전화번호 주소를 입력하세요.");
							name[i]=br.readLine();
							age[i]=br.readLine();
							phone[i]=br.readLine();
							address[i]=br.readLine();
							break;
						}else {
							break;
						}
					}
				}
				break;

			case 5:
				System.out.println("삭제하실 번호 입력 : ");
				String res2 = br.readLine();
				int pick2 = Integer.parseInt(res2);
				for(int i = 0; i<num; i++) {
					if(count[i]==pick2) {
						for(i=(pick2-1); i<num; i++) {
							name[i]=name[i+1];
							age[i]=age[i+1];
							phone[i]=phone[i+1];
							address[i]=address[i+1];
						}
						count[num-1]=0; name[num]=null; age[num]=null; phone[num]=null; address[num]=null;
						System.out.println("삭제되었습니다.");
					}
				}


			}


		}
	}
}
