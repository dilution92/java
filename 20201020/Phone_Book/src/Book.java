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
		            System.out.print("이름을 입력하세요.>>  ");
		            p.get(count).setName(sc.next());
		            if(p.get(count).getName().length() < 3) {
		               System.out.println("3글자 이상 입력하셔야 합니다. 다시 입력하세요.");
		            }
		            else {
		               System.out.println("입력되었습니다.");
		               break;
		            }
		         }


		         while(true) {
		            try {
		               System.out.print("나이를 입력하세요.>>  ");
		               p.get(count).setAge(sc.nextInt());   
		               System.out.println("입력되었습니다.");
		               break;
		            }
		            catch(InputMismatchException e) {
		               sc = new Scanner(System.in);
		               System.out.println("숫자만 입력 가능합니다. 다시 입력하세요.");
		            }
		         }


		         while(true) {
		            System.out.println("전화번호를 010과 (-) 입력없이 8자리로 입력하세요.  ");
		            p.get(count).setPhone(sc.next());

		            if(!p.get(count).getPhone().matches(regExp)) {
		               System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요.");
		               continue;
		            }

		            else if(p.get(count).getPhone().length() > 8) {
		               System.out.println("8자리 이상 입력하셨습니다. 다시 입력하세요.");   
		               continue;
		            }

		            else if(count == 0) {
		               System.out.println("입력되었습니다.");
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
		               System.out.println("이미 등록된 번호입니다. 다시 입력하세요.");
		               SAMENUM = 0;
		               continue;
		            }
		            System.out.println("입력되었습니다.");
		            p.get(count).rank = admincode;
		            break;
		         }
		         count++;
		         System.out.println("추가로 입력하시겠습니까? 네/아니오");
		         String answer = sc.next();
		         if(answer.equals("아니오")) {
		            break;
		         }
		      }
		   }

	   

	public void modify() {
		String res;
		System.out.println("수정하실 자료의 이름을 입력하세요.");
		res = sc.next();
		for (int i = 0; i < p.size(); i++) {
			if(p.get(i).getName().equals(res)) {
				if(p.get(i).getRank() <= admincode) {
					while(true) {
			            try {
			               System.out.print("나이를 입력하세요.>>  ");
			               p.get(i).setAge(sc.nextInt());   
			               System.out.println("입력되었습니다.");
			               break;
			            }
			            catch(InputMismatchException e) {
			               sc = new Scanner(System.in);
			               System.out.println("숫자만 입력 가능합니다. 다시 입력하세요.");
			            }
			         }


			         while(true) {
			            System.out.println("전화번호를 010과 (-) 입력없이 8자리로 입력하세요.  ");
			            p.get(i).setPhone(sc.next());

			            if(!p.get(i).getPhone().matches(regExp)) {
			               System.out.println("숫자만 입력 가능합니다. 다시 입력해주세요.");
			               continue;
			            }

			            else if(p.get(i).getPhone().length() > 8) {
			               System.out.println("8자리 이상 입력하셨습니다. 다시 입력하세요.");   
			               continue;
			            }

			            else if(count == 0) {
			               System.out.println("입력되었습니다.");
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
			               System.out.println("이미 등록된 번호입니다. 다시 입력하세요.");
			               SAMENUM = 0;
			               continue;
			            }
			            System.out.println("입력되었습니다.");
			            p.get(count).setRank(admincode);
			            break;
			         }
			         count++;
			         System.out.println("추가로 입력하시겠습니까? 네/아니오");
			         String answer = sc.next();
			         if(answer.equals("아니오")) {
			            break;
			         }
					p.get(i).setRank(admincode);
				}else {
					System.out.println("해당 권한이 없습니다.");
				}
			}
		}
	}

	public void search() {
		for(;;) {
			System.out.println("(1) 이름으로 검색");
			System.out.println("(2) 나이로 검색");
			System.out.println("(3) 전화번호로 검색");
			int sr = sc.nextInt();
			if (sr ==1) {
				System.out.print("이름 입력 : ");
				String srName = sc.next();//이름입력받기
				for (int i = 0; i < p.size(); i++) {
					if (srName.equals(p.get(i).getName())) {
						System.out.println(p.get(i));
					}else {
						System.out.println("결과가 없습니다 다시 입력해주세요");
					}
				}

			} if (sr ==2) {
				System.out.print("나이 입력 : ");
				String srAge = sc.next();//나이입력받기
				for (int i = 0; i < p.size(); i++) {
					if (srAge.equals(p.get(i).getAge())) {
						System.out.println(p.get(i));
					}else {
						System.out.println("결과가 없습니다 다시 입력해주세요");
					}
				}
			} if (sr ==3) {
				System.out.print("전화번호 입력(뒤4자리를 입력해주세요) : ");
				String srPhone = sc.next();//전화번호입력받기
				for (int i = 0; i < p.size(); i++) {
					String Ph = p.get(i).getPhone();
					if (srPhone.equals(Ph.substring(4,8))) {
						System.out.println(p.get(i));
					}else {
						System.out.println("결과가 없습니다 다시 입력해주세요");
					}
				}
			}
		}
	}


	 public void print() {
	      System.out.println("--------------------------------------");
	      System.out.println("                              ☎  Phone List ☎                        ");
	      System.out.println("[No\t|이름\t|나이\t|전화번호      ]");
	      for (int i = 0; i < p.size(); i++) {
	      System.out.println((p.toString()));
	      System.out.println();

	   }
	      System.out.println("--------------------------------------");

	   }
}
