package frame;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Indep extends JFrame {
	public Indep() {
		setTitle("Action 이번트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
		setSize(350,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Indep();
	}
}
class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) {
			b.setText("액션");
		} else {
			b.setText("Action");
		}
	}
}