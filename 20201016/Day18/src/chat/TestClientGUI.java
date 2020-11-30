package chat;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TestClientGUI extends JFrame implements ActionListener{

	static ChattingClient client = new ChattingClient();
	ChattingServer server = new ChattingServer();
	static JTextArea textArea = new JTextArea(20,30);
	JTextField textField = new JTextField();
	JButton inputBt = new JButton("입력");
	JScrollPane scroll = new JScrollPane(textArea);

	public TestClientGUI() {

		setLayout(null);

		scroll.setBounds(0,0,490,500);
		textField.setBounds(0, 500, 400, 30);
		inputBt.setBounds(400,500,80,30);

		add(scroll);
		add(textField);
		add(inputBt);

		setTitle("TestClient");
		setBounds(0,0,500,570);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		inputBt.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		switch(e.getActionCommand()) {
		case "입력" :
			String msg = textField.getText() + "\n";
			if(textField.getText().length() >0) {
				textArea.append(msg);
				client.sendMsg(msg);
				textField.setText("");
			}
			textField.requestFocusInWindow();
			break;
		}
	}
	public static void main(String[] args) {
		TestClientGUI t = new TestClientGUI();
		client.connect();
	}

}
