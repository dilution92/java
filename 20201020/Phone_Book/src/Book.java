import java.util.*;

public class Book {
	int admincode, count, SAMENUM;
	String namecode;
	Scanner sc = new Scanner(System.in);
	ArrayList<Person> p ;	
	String regExp;
	
	public Book() {
		p = new ArrayList<>();
		count =0;
		regExp = "^[0-9]+$";
	}

	   public void add() {
		      while(true) {
		         p.add(new Person());

		         while(true) {
		            System.out.print("�̸��� �Է��ϼ���.>>  ");
		            p.get(count).setName(sc.next());
		            if(p.get(count).getName().length() < 3) {
		               System.out.println("3���� �̻� �Է��ϼž� �մϴ�. �ٽ� �Է��ϼ���.");
		            }
		            else {
		               System.out.println("�ԷµǾ����ϴ�.");
		               break;
		            }
		         }


		         while(true) {
		            try {
		               System.out.print("���̸� �Է��ϼ���.>>  ");
		               p.get(count).setAge(sc.nextInt());   
		               System.out.println("�ԷµǾ����ϴ�.");
		               break;
		            }
		            catch(InputMismatchException e) {
		               sc = new Scanner(System.in);
		               System.out.println("���ڸ� �Է� �����մϴ�. �ٽ� �Է��ϼ���.");
		            }
		         }


		         while(true) {
		            System.out.println("��ȭ��ȣ�� 010�� (-) �Է¾��� 8�ڸ��� �Է��ϼ���.  ");
		            p.get(count).setPhone(sc.next());

		            if(!p.get(count).getPhone().matches(regExp)) {
		               System.out.println("���ڸ� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
		               continue;
		            }

		            else if(p.get(count).getPhone().length() > 8) {
		               System.out.println("8�ڸ� �̻� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");   
		               continue;
		            }

		            else if(count == 0) {
		               System.out.println("�ԷµǾ����ϴ�.");
		               break;
		            }

		            else if(count != 0) {
		               for(int i = 0; i<count;i++) {
		                  if(p.get(count).getPhone().equals(p.get(i).getPhone())) {
		                     SAMENUM = 1;
		                  }
		               }
		            }
		            if(SAMENUM == 1) {
		               System.out.println("�̹� ��ϵ� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
		               SAMENUM = 0;
		               continue;
		            }
		            System.out.println("�ԷµǾ����ϴ�.");
		            p.get(count).rank = admincode;
		            break;
		         }
		         count++;
		         System.out.println("�߰��� �Է��Ͻðڽ��ϱ�? ��/�ƴϿ�");
		         String answer = sc.next();
		         if(answer.equals("�ƴϿ�")) {
		            break;
		         }
		      }
		   }

	   

	public void modify() {
		String res;
		System.out.println("�����Ͻ� �ڷ��� �̸��� �Է��ϼ���.");
		res = sc.next();
		for (int i = 0; i < p.size(); i++) {
			if(p.get(i).getName().equals(res)) {
				if(p.get(i).getRank() <= admincode) {
					while(true) {
			            try {
			               System.out.print("���̸� �Է��ϼ���.>>  ");
			               p.get(i).setAge(sc.nextInt());   
			               System.out.println("�ԷµǾ����ϴ�.");
			               break;
			            }
			            catch(InputMismatchException e) {
			               sc = new Scanner(System.in);
			               System.out.println("���ڸ� �Է� �����մϴ�. �ٽ� �Է��ϼ���.");
			            }
			         }


			         while(true) {
			            System.out.println("��ȭ��ȣ�� 010�� (-) �Է¾��� 8�ڸ��� �Է��ϼ���.  ");
			            p.get(i).setPhone(sc.next());

			            if(!p.get(i).getPhone().matches(regExp)) {
			               System.out.println("���ڸ� �Է� �����մϴ�. �ٽ� �Է����ּ���.");
			               continue;
			            }

			            else if(p.get(i).getPhone().length() > 8) {
			               System.out.println("8�ڸ� �̻� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");   
			               continue;
			            }

			            else if(count == 0) {
			               System.out.println("�ԷµǾ����ϴ�.");
			               break;
			            }

			            else if(count != 0) {
			               for(int j = 0; j<count;j++) {
			                  if(p.get(i).getPhone().equals(p.get(j).getPhone())) {
			                     SAMENUM = 1;
			                  }
			               }
			            }
			            if(SAMENUM == 1) {
			               System.out.println("�̹� ��ϵ� ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
			               SAMENUM = 0;
			               continue;
			            }
			            System.out.println("�ԷµǾ����ϴ�.");
			            p.get(count).setRank(admincode);
			            break;
			         }
			         count++;
			         System.out.println("�߰��� �Է��Ͻðڽ��ϱ�? ��/�ƴϿ�");
			         String answer = sc.next();
			         if(answer.equals("�ƴϿ�")) {
			            break;
			         }
					p.get(i).setRank(admincode);
				}else {
					System.out.println("�ش� ������ �����ϴ�.");
				}
			}
		}
	}

	public void search() {
		for(;;) {
			System.out.println("(1) �̸����� �˻�");
			System.out.println("(2) ���̷� �˻�");
			System.out.println("(3) ��ȭ��ȣ�� �˻�");
			int sr = sc.nextInt();
			if (sr ==1) {
				System.out.print("�̸� �Է� : ");
				String srName = sc.next();//�̸��Է¹ޱ�
				for (int i = 0; i < p.size(); i++) {
					if (srName.equals(p.get(i).getName())) {
						System.out.println(p.get(i));
					}else {
						System.out.println("����� �����ϴ� �ٽ� �Է����ּ���");
					}
				}

			} if (sr ==2) {
				System.out.print("���� �Է� : ");
				String srAge = sc.next();//�����Է¹ޱ�
				for (int i = 0; i < p.size(); i++) {
					if (srAge.equals(p.get(i).getAge())) {
						System.out.println(p.get(i));
					}else {
						System.out.println("����� �����ϴ� �ٽ� �Է����ּ���");
					}
				}
			} if (sr ==3) {
				System.out.print("��ȭ��ȣ �Է�(��4�ڸ��� �Է����ּ���) : ");
				String srPhone = sc.next();//��ȭ��ȣ�Է¹ޱ�
				for (int i = 0; i < p.size(); i++) {
					String Ph = p.get(i).getPhone();
					if (srPhone.equals(Ph.substring(4,8))) {
						System.out.println(p.get(i));
					}else {
						System.out.println("����� �����ϴ� �ٽ� �Է����ּ���");
					}
				}
			}
		}
	}


	 public void print() {
	      System.out.println("--------------------------------------");
	      System.out.println("                              ��  Phone List ��                        ");
	      System.out.println("[No\t|�̸�\t|����\t|��ȭ��ȣ      ]");
	      for (int i = 0; i < p.size(); i++) {
	      System.out.println((p.toString()));
	      System.out.println();

	   }
	      System.out.println("--------------------------------------");

	   }
}
