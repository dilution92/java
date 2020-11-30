package phone;

import java.util.Scanner;

public class Book {
	Scanner sc = new Scanner(System.in);
	int select, count, con, code;
	String ress;
	int resi;
	Person [] p;

	public Book() {
		count=0;
		con=0;
		p = new Person[10];
	}

	public void add() {
		if(count <10) {
			p[count] = new Person();	
			while(con==0) {
				System.out.println("이름을 입력하세요. ");
				ress = sc.next();
				if(ress.length()>=2) {
					p[count].setName(ress);
					con=1;
				}else {
					System.out.println("두글자 이상으로 입력해주세요.");
				}
			}
			con=0;
			while(con==0) {
				System.out.println("전화번호를 입력하세요. (010-****-****)형태");
				System.out.print("010-");
				ress = sc.next();
				if(ress.length()==9) {
					p[count].setNumber(ress);
					con=1;
				}else {
					System.out.println("****-****형태로 입력해주세요.");
				}
			}
			con=0;
			System.out.println("나이를 입력하세요.");
			p[count].setAge(sc.nextInt());

			System.out.println("주소를 입력하세요.");
			p[count].setAddress(sc.nextLine());
			count++;
			
			p[count].setRank(code);
		}
	}

	public void print() {
		System.out.println("이름"+"\t"+"나이"+"\t"+"전화번호"+"\t"+"주소");
		for(int i=0; i<count; i++) {
			System.out.print(p[i].getName()+"\t");
			System.out.print(p[i].getAge()+"\t");
			System.out.print(p[i].getNumber()+"\t");
			System.out.print(p[i].getAddress()+"\t");
		}
	}

	public void search() {
		System.out.println("찾으실 분의 이름을 입력하세요.");
		ress=sc.next();
		for(int i=0; i<count; i++) {
			if(ress.equals(p[i].getName())) {
				System.out.println("이름"+"\t"+"나이"+"\t"+"전화번호"+"\t"+"주소");
				System.out.print(p[i].getName()+"\t");
				System.out.print(p[i].getAge()+"\t");
				System.out.print(p[i].getNumber()+"\t");
				System.out.print(p[i].getAddress()+"\t");
			}
		}
	}

	public void modify() {
		System.out.println("찾으실 분의 이름을 입력하세요.");
		ress=sc.next();
		for(int i=0; i<count; i++) {
			if(ress.equals(p[i].getName())) {
				if(p[i].getRank() <= code) {
					while(con==0) {
						System.out.println("전화번호를 입력하세요. (010-****-****)형태");
						System.out.print("010-");
						ress = sc.next();
						if(ress.length()==9) {
							p[count].setNumber(ress);
							con=1;
						}else {
							System.out.println("****-****형태로 입력해주세요.");
						}
					}
					con=0;
					System.out.println("나이를 입력하세요.");
					p[count].setAge(sc.nextInt());

					System.out.println("주소를 입력하세요.");
					p[count].setAddress(sc.nextLine());
					p[count].setRank(code);
				}else {
					System.out.println("권한이 없습니다.");
				}
			}
		}
	}

}
