package chat;

import java.awt.*;
import javax.swing.*;


import java.awt.event.*;


public class TestServerGUI extends JFrame implements ActionListener	{
	
	static ChattingServer server = new ChattingServer();
	ChattingClient client = new ChattingClient();
	static JTextArea textArea = new JtextArea(20,30);
	JTextField textField = new JtextField();
	JButton inputBt = new JButton("입력");
	JScrollPane scroll = new JScrollPane(textArea);
	
	public TestServerGUI() {
		setLayout(null);
		
		scroll.setBounds(0,0,490,500);
		textField.setBounts(0,500,400,30);
		inputBt.setBounds(300,500,80,30);
		
		add(scroll);
		add(textField);
		add(inputBt);
		
		setTitle("TestServer");
		setBounds(0,0,500,570);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		inputBt.addActionListener(this);
		
		public void actionPerformed(ActionEvent e) {
			
			switch(e.getActionCommand()) {
			case "입력" :
				String msg = textField.getText() + "\n";
				if(textField.getText().length() >0) {
					textArea.append(msg);
					server.msgSend(msg);
					textField.setText("");
				}
				textField.requestFocusInWindow();
				break;
			}
		}
	}
	public static void main(String[] args) {
		TestServerGUI t = new TestServerGUI();
		server.serverSet();
	}
}
