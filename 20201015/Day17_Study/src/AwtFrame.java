
import java.awt.*;
import java.awt.event.*;

public class AwtFrame {
	private Frame fr;
	private Label label;
	private Panel panel;
	
	public AwtFrame() {
		initFrame();
		showButton();
	}
	
	private void initFrame() {
		fr = new Frame("First");
		fr.setSize(500,500);
		fr.setLayout(new GridLayout(3,1));
		fr.setVisible(true);
		
		fr.addWindowListener(new WindowAdapter() {
			public void WindowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		label = new Label();
		label.setText("Status Label");
		label.setAlignment(Label.CENTER);
		label.setSize(200,100);
		
		panel = new Panel();
		panel.setLayout(new FlowLayout());
		
		fr.add(panel);
		fr.add(label);
		fr.setVisible(true);
	}
	void showButton() {
		Button btnOk = new Button("OK");
		Button btnCancel = new Button("Cancel");
		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("확인");
			}
		});
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("취소");
			}
		});
		
		panel.add(btnOk);
		panel.add(btnCancel);
		fr.setVisible(true);
	}
	public static void main(String[] args) {
		AwtFrame af = new AwtFrame();
		
	}
}
