package thereaEx;

import java.awt.*;
import javax.swing.*;

class TimeRun implements Runnable{
	private JLabel timerLabel; // Ÿ�̸� ���� ��µ� ���̺�
	
	public TimeRun(JLabel timerLaber) {
		this.timerLabel = timerLaber; // �� ī��Ʈ�� ����� ���̺�
	}
	
	// ������ �ڵ�. run()�� �����ϸ� ������ ����
	public void run() {
		int n =0; //Ÿ�̸� ī��Ʈ ��
		while(true) { // ���ѷ���
			timerLabel.setText(Integer.toString(n)); // ���̺� ī��Ʈ �� ���
			n++;// ī��Ʈ ����
			try {
				Thread.sleep(1000); //1�ʵ��� ���� �ܴ�.
			}
			catch(InterruptedException e) {
				return; // ���ܰ� �߻��ϸ� ������ ����
			}
		}
	}
}


public class Timer extends JFrame {
	
	public Timer() {
		setTitle("Runnable�� ������ Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);//���̺��� ����Ʈ�ҿ� ����
		
		//Ÿ�̸� ������� ����� Runnable ��ü ����. Ÿ�̸� ���� ����� ���̺��� �����ڿ� ����
		TimeRun runnable = new TimeRun(timerLabel);
		Thread th = new Thread(runnable);//������ ��ü ����
		
		setSize(250, 150);
		setVisible(true);
		
		th.start(); // Ÿ�̸� �����尡 ������  �����ϰ� �Ѵ�.
	}
	public static void main(String[] args) {

		new Timer();
	}

}
