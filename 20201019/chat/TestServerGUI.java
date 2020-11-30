package com.network;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestServerGUI extends JFrame implements ActionListener {

	static TestServer server = new TestServer();
	TestClient client = new TestClient();
	static JTextArea textArea = new JTextArea(20, 30);
	JTextField textField = new JTextField();
	JButton inputBt = new JButton("입력");
	JScrollPane scroll = new JScrollPane(textArea);

	public TestServerGUI() {

		setLayout(null);

		scroll.setBounds(0, 0, 490, 500);
		textField.setBounds(0, 500, 400, 30);
		inputBt.setBounds(400, 500, 80, 30);

		add(scroll);
		add(textField);
		add(inputBt);

		setTitle("TestServer");
		setBounds(0, 0, 500, 570);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		inputBt.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		case "입력":
			String msg = textField.getText() + "\n";
			if (textField.getText().length() > 0) {
				textArea.append(msg);
				server.msgSend(msg);
				textField.setText("");
			}
			textField.requestFocusInWindow();
			break;
		}

	}

	public static void main(String[] args) {

		TestServerGUI t = new TestServerGUI();
		server.serverSet();

	}
}
