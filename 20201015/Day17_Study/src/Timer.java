import java.awt.*;
import javax.swing.*;

class TR implements Runnable{
	private JLabel timerLabel;

	public TR(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	public void run() {
		int n =0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}





public class Timer extends JFrame{
	
	public Timer() {
		setTitle("Runable�� ������ Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TR runnable = new TR(timerLabel);
		Thread th = new Thread(runnable);
		
		setSize(250,250);
		setVisible(true);
		
		th.start();
	}

	public static void main(String[] args) {
		new Timer();
	}

}
