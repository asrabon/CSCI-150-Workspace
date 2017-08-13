import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IntrestFrame extends JFrame{
	
	private JButton button;
	private JLabel resultLabel;
	private double balance;
	private JPanel panel;
	
	private static final double INTEREST_RATE = 5;
	private static final double INITIAL_BALANCE = 1000;
	private final int FRAME_WIDTH = 500;
	private final int FRAME_HEIGHT = 500;
	
	public IntrestFrame() {
		balance = INITIAL_BALANCE;
		
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	class AddInterestListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			double interest = balance * INTEREST_RATE / 100;
			balance += interest;
			resultLabel.setText("Balance: " + balance);
		}
	}

	private void createComponents() {
		button = new JButton("Add Interest");
		resultLabel = new JLabel("Balance: " + balance);
		panel = new JPanel();
		ActionListener interestListener = new AddInterestListener();
		button.addActionListener(interestListener);
		panel.add(button);
		panel.add(resultLabel);
		add(panel);
	}
	
}
