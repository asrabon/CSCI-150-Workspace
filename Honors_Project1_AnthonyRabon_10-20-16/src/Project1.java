import javax.swing.JFrame;
public class Project1 {
	
	public static void main(String[] args) {
		JFrame mailFrame = new MailFrame();//creates an instance of the GUI 
		mailFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sets the default closing operation to the x button in top right
		mailFrame.setTitle("Email System.");
		mailFrame.setResizable(true);
		mailFrame.setVisible(true);	
	
	}

}