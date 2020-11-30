package exam;

import java.util.Scanner;

public class Subject {

	String[] sj;
	int count;
	Student[] stud;

	Scanner sc = new Scanner(System.in);

	public Subject() {
		sj = new String[3];
		count = 0;
		stud = new Student[50];
	}

	void run() {
		inputSubject();
		menu();
	}

	void inputSubject() {
		for(int i =0; i<sj.length; i++) {
			System.out.println("������� �Է��ϼ��� : ");
			sj[i] = sc.next();
		}
	}

	void menu() {
		while (true) {
			System.out.println("���ϴ� �޴��� �����ϼ���.");
			System.out.println("1. �л� �̸� �߰�");
			System.out.println("2. �л� ��� ǥ��");
			System.out.println("3. ���α׷� ����");
			int c = sc.nextInt();

			if (c ==1) {
				System.out.println("�л��� �߰��Ͻ� ������� �Է��ϼ��� : ");
				String s = sc.next();

				for(int i=0; i<sj.length; i++) {
					if(s.equals(sj[i])) {
						System.out.println("�߰��Ͻ� �л��� �̸��� �Է��ϼ��� : ");
						stud[count] = new Student();
						stud[count].name = sc.next();
						stud[count].sb = i;

						count ++;
					}
				}
			}

			if (c ==2) {
				System.out.println("-------������ �л� ���--------");
				for(int i=0; i<count; i++) {
					if(stud[i].sb == 0) {
						System.out.println(sj[0] + ": "+ stud[i].name);
					}

					if(stud[i].sb == 1) {
						System.out.println(sj[1] + ": "+ stud[i].name);
					}

					if(stud[i].sb == 2) {
						System.out.println(sj[2] + ": "+ stud[i].name);
					}
				}
			}

			if(c ==3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}




		}
	}

	public static void main(String[] args) {




	}

}
