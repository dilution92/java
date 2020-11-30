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
				System.out.println("�̸��� �Է��ϼ���. ");
				ress = sc.next();
				if(ress.length()>=2) {
					p[count].setName(ress);
					con=1;
				}else {
					System.out.println("�α��� �̻����� �Է����ּ���.");
				}
			}
			con=0;
			while(con==0) {
				System.out.println("��ȭ��ȣ�� �Է��ϼ���. (010-****-****)����");
				System.out.print("010-");
				ress = sc.next();
				if(ress.length()==9) {
					p[count].setNumber(ress);
					con=1;
				}else {
					System.out.println("****-****���·� �Է����ּ���.");
				}
			}
			con=0;
			System.out.println("���̸� �Է��ϼ���.");
			p[count].setAge(sc.nextInt());

			System.out.println("�ּҸ� �Է��ϼ���.");
			p[count].setAddress(sc.nextLine());
			count++;
			
			p[count].setRank(code);
		}
	}

	public void print() {
		System.out.println("�̸�"+"\t"+"����"+"\t"+"��ȭ��ȣ"+"\t"+"�ּ�");
		for(int i=0; i<count; i++) {
			System.out.print(p[i].getName()+"\t");
			System.out.print(p[i].getAge()+"\t");
			System.out.print(p[i].getNumber()+"\t");
			System.out.print(p[i].getAddress()+"\t");
		}
	}

	public void search() {
		System.out.println("ã���� ���� �̸��� �Է��ϼ���.");
		ress=sc.next();
		for(int i=0; i<count; i++) {
			if(ress.equals(p[i].getName())) {
				System.out.println("�̸�"+"\t"+"����"+"\t"+"��ȭ��ȣ"+"\t"+"�ּ�");
				System.out.print(p[i].getName()+"\t");
				System.out.print(p[i].getAge()+"\t");
				System.out.print(p[i].getNumber()+"\t");
				System.out.print(p[i].getAddress()+"\t");
			}
		}
	}

	public void modify() {
		System.out.println("ã���� ���� �̸��� �Է��ϼ���.");
		ress=sc.next();
		for(int i=0; i<count; i++) {
			if(ress.equals(p[i].getName())) {
				if(p[i].getRank() <= code) {
					while(con==0) {
						System.out.println("��ȭ��ȣ�� �Է��ϼ���. (010-****-****)����");
						System.out.print("010-");
						ress = sc.next();
						if(ress.length()==9) {
							p[count].setNumber(ress);
							con=1;
						}else {
							System.out.println("****-****���·� �Է����ּ���.");
						}
					}
					con=0;
					System.out.println("���̸� �Է��ϼ���.");
					p[count].setAge(sc.nextInt());

					System.out.println("�ּҸ� �Է��ϼ���.");
					p[count].setAddress(sc.nextLine());
					p[count].setRank(code);
				}else {
					System.out.println("������ �����ϴ�.");
				}
			}
		}
	}

}
