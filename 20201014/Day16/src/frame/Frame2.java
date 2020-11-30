package frame;
import javax.swing.*;
class MyFrame extends JFrame{
	MyFrame(){
	showa();
	}
	public void showa() {
		setTitle("첫번쨰 프레임");
		setSize(500,500);
		setVisible(true);
	}
}

public class Frame2 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
