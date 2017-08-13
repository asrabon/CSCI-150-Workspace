import java.awt.Button;

import javax.swing.*;


public class FilledFrame extends JFrame {

	final int FRAME_WIDTH = 400;
	final int FRAME_HEIGHT = 400;
	private JButton button;
	private JLabel label;
	private JPanel panel;
	
	public FilledFrame() {
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	public void createComponents() {
		button = new JButton("Click me!");
		label = new JLabel("Hello World!");
		panel = new JPanel();
		panel.add(button);
		panel.add(label);
		this.add(panel);
	}
	
}
