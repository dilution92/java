package exam;

import java.util.Scanner;

class Person	{
	String name;
	public Person() {
		
	}
	void setName(String a) {
		name = a;
	}
	String getName() {
		return name;
	}
	public String toString() {
		return name;
	}
}
class Word {
	char last;
	char fir;
	public Word() {
		
	}
	void setLast(String a) {
		last = a.charAt(a.lastIndexOf(a));
	}
	void setLast1(char a) {
		last = a;
	}
	void setFir(String a) {
		fir = a.charAt(0);
	}
	void setFir1(char a) {
		fir = a;
	}
	char getFir() {
		return fir;
	}
	char getLast() {
		return last;
	}
}

public class Ex9 {

	public static void main(String[] args) {
		int num;
		String res;
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ձ� ������ �����մϴ�.");
		System.out.println("���ӿ� �����ϴ� �ο��� ����Դϱ�? >> ");
		num = sc.nextInt();
		Person [] p = new Person[num];
		Word [] word = new Word[num+2];
		for(int i = 0; i<p.length; i++) {
			p[i]=new Person();
			word[i+2]=new Word();
		}
		
		word[0]	=new Word();
		word[1]	=new Word();
		for(int i =0; i<p.length; i++) {
			System.out.println((i+1)+"�� �������� �̸��� >> ");
			p[i].setName(sc.next());
		}
		
		System.out.println("���� �ܾ �Է����ּ��� : ");
		res = sc.next();
		word[0].setLast(res);
		System.out.println("�����ϴ� �ܾ�� "+res+"�Դϴ�.");
		
		for(int i=0; i<p.length; i++) {
			System.out.print(p[i]+">> ");
			res = sc.next();
			word[i+1].setFir(res);
//			if(word[i+1].getFir() == word[i].getLast()) {
//				continue;
//				
//			}else 
				if(word[i+1].getFir() != word[i].getLast()) {
				System.out.println(p[i]+"�� �����ϴ�.");
				break;
				
			}if(word[3].getFir() == word[2].getLast()) {
				word[0].setLast1(word[3].getLast()); 
				
			}if(i==(p.length-1))	{
				i = i-(p.length-1);
			}
			word[i+2].setFir1(word[i+1].getLast());
		}
	}
}
