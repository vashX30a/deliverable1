package del1;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	private JLabel myLabel; 
	
	public MyFrame(){
		super("My Fucking Frame");
		setLayout(new FlowLayout());
	
		myLabel = new JLabel("Fuck this shit.");
		myLabel.setToolTipText("Fuck off asshole!");
		add(myLabel);
	}
}


