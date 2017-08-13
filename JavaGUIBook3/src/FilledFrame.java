import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class FilledFrame extends JFrame {
	
	public class ClickListener implements ActionListener{

		public void actionPerformed(ActionEvent event) {
			label.setText("I was clicked!");
		}
	}


	final int FRAME_WIDTH = 400;
	final int FRAME_HEIGHT = 400;
	private JButton button;
	private JLabel label;
	private JPanel panel;
	private ClickListener clickListener;
	
	public FilledFrame() {
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	public void createComponents() {
		button = new JButton("Click me!");
		label = new JLabel("Hello World!");
		clickListener = new ClickListener();
		button.addActionListener(clickListener);
		panel = new JPanel();
		panel.add(button);
		panel.add(label);
		this.add(panel);
	}
	
}
