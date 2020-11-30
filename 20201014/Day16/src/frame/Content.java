package frame;

import javax.swing.*;
import java.awt.*;
public class Content extends JFrame{
	public Content() {
		setTitle("Content and JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLACK);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("Ok"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Content();
	}

}
