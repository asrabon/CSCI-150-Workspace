import javax.swing.*;

public class GUI1 extends JFrame{
	
	public static void main (String[] args) {
		final int FRAME_HEIGHT = 300;
		final int FRAME_WIDTH = 400;
		
		JFrame frame = new JFrame();
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("It's an empty frame.");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton clickMeButton = new JButton("Click me!");
		JLabel helloLabel = new JLabel("Hello World!");
		
		JPanel panel = new JPanel();
		panel.add(clickMeButton);
		panel.add(helloLabel);
		frame.add(panel);
		
		frame.setVisible(true);
	}

}
