package frame;
import java.util.Scanner;

import javax.swing.JFrame;

public class Frame1 extends JFrame {
	Frame1(){
		setTitle("ù��° ������");
		setSize(960,540);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�޴�����");
		int a = sc.nextInt();
		if(a==1) {
			Frame1 f = new Frame1();
		}
	}

}
