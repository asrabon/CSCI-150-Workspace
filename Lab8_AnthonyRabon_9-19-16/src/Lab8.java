import java.util.Scanner;

public class Lab8 {
	
	/**
	 * 
	 * @programName lab 8
	 * @class CSCI 150L
	 * @programmer Anthony Rabon
	 * @lastRevised 9-19-16
	 *
	 */

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String sender = getString(in, "Enter the sender's name: ");
		String recipient = getString(in, "Enter the recipient's name: ");
		Message message = new Message(sender, recipient);
		String appendText = getString(in , "Enter the first line of your message or enter \"***\" to quit wiriting to the message.");
		while(!appendText.equals("***")) {
			message.append(appendText);
			appendText = getString(in , "Enter the next line of your message or enter \"***\" to quit wiriting to the message.");
		}
		System.out.println(message.toString());
	}
	
	public static String getString (Scanner in, String prompt) {
		System.out.println(prompt);
		String s = in.nextLine();
		return s;
	}
	
}
