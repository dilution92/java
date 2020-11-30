package frame;
import java.awt.*;
import java.awt.event.*;

//AWT ȭ���� �����ϴ� Ŭ����
public class GuiFrame {
	private Frame fr;
	private Label label;
	private Panel panel;


	public GuiFrame() {
		initFrame();
	}

	//���� ȭ�鿡 ���� ����
	private void initFrame() {
		fr = new Frame("First GUI");
		fr.setSize(500,500);
		fr.setLayout(new GridLayout(3,1));
		fr.setVisible(true);


		//GUI ���α׷� �����̺�Ʈ ó��
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		//������ ������ ǥ���ϴ� label ��ü
		label = new Label();
		label.setText("Status Label");
		label.setAlignment(Label.CENTER);
		label.setSize(200,100);

		//��ư�� ��� ���� panel ��ü
		panel =new Panel();
		panel.setLayout(new FlowLayout());

		//panel�� label�� frame�� �߰��ϰ� ȭ�鿡 ���̵��� ��
		fr.add(panel);
		fr.add(label);
		fr.setVisible(true);
	}

	//��ư�� �����ϰ� Ŭ�� �̺�Ʈ�� ó���ϴ� �޼ҵ�
	void showButton() {
		Button btnOk = new Button("OK");
		Button btnCancel = new Button("Cancel");

		//btnOk ��ư�� Ŭ���� ��� label�� Ȯ�� ���� ���
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Ȯ��");
			}
		});

	//btnCancel ��ư�� Ŭ���� ��� label�� ��� ���� ���
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("���");
			}
		});

		//panel ��ü�� 2���� ��ư�� �߰��ϰ� frame�� ���
		panel.add(btnOk);
		panel.add(btnCancel);
		fr.setVisible(true);

	}
}
