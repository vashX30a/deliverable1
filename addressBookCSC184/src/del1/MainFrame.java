package del1;
import javax.swing.JFrame;

public class MainFrame {
	
	public static void main(String args[]){
		MyFrame frame = new MyFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);
		Functionalities functions = new Functionalities();
		functions.addContact();
	}
}
