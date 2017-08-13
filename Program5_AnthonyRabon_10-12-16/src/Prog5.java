import java.util.Scanner;

public class Prog5 {
	
	public static void main(String[] args) {
		//initializes variables and classes that will be used in the program
		char userInput;//used to store which option the user picks to do
		String userName = "";//name of the user currently logged in
		MailSystem mailSys = new MailSystem();//mailsystem used to deliver messages and create mailboxes for users
		Scanner in = new Scanner(System.in);//scanner used to get user input
		userInput = getUserInput(in);
		
		//while statement that goes through running the program sending messages and etc until the user enters e or E to exit
		while(userInput != 'e' && userInput != 'E') {
			//switch statement that determines what the user inputted and does the according steps for each case
			switch(userInput) {
			case 'l': case 'L': userName = loginUser(in, userName); break;//calls the method to get the user's name to log in
			case 'w': case 'W': writeMessage(in, userName, mailSys) ; break;//calls the writeMessage method to prompt the user to write a message
			case 'i': case 'I': getMessages(mailSys, userName, "inbox") ; break;//calls the getMessages method to print the messages in the user's inbox
			case 's': case 'S': getMessages(mailSys, userName, "outbox") ; break;//calls the getMessages method to print the messages in the user's outbox
			case 'o': case 'O': userName = "" ; break;//sets userName equal to nothing
			case 'e': case 'E': break;
			default: System.out.println("Error: you did not enter a valid option from the menu."); break;//if none of the options were entered prompts error
			}
			userInput = getUserInput(in);
		}
	}
	
	/**
	 * 
	 * @param in Scanner used to allow the user to input data like the char needed
	 * @return the char for what the user wants the program to do next
	 * 
	 * This method asks the user what they want the program to do next and scans the user's input then returns it back to main
	 */
	public static char getUserInput (Scanner in) {
		System.out.println("L)og In    W)rite message    I)nbox   S)ent Mail    O)ff—Log Out     E)xit");
		return in.next().charAt(0);
	}
	

	/**
	 * 
	 * @param in Scanner used to get the user's name to login
	 * @param name String the contains the current user's name
	 * @return the name the user entered to login
	 * 
	 * This method checks to see if someone is already logged in if someone is already logged in it prompts an error message otherwise
	 * the program gets the name of the user and returns it to main.
	 */
	public static String loginUser(Scanner in, String name) {
		//check if noone is logged in if so prompts error message
		if (!name.equals("")) {
			System.out.println("Error: Only one user can be logged in at a time");
			return name;
		}
		//asks the user for the name and returns the name back to main
		else {
			System.out.println("Enter your name to login in: ");
			return in.next();
		}
	}
	
	/**
	 * 
	 * @param in Scanner used to get user information as to who to send the message to and the message body
	 * @param name current user logged in to the program
	 * @param mailSys mailsystem used to deliever the message created once completed
	 * 
	 * This method first checks to see if anyone is logged in if someone is it prints an error message, otherwise
	 * it gets the recipients name from the user, creates a message object then the user writes to until a blank line is entered 
	 * then the message is completed and sent to the recipient's inbox and sender's outbox
	 */
	public static void writeMessage(Scanner in , String name, MailSystem mailSys) {
		//check if noone is logged in if so prompts error message
		if (name.equals("")) {
			System.out.println("Error: you must be logged in to send a message");
		}
		else {
			//gets the recipient's name and creates a message object with the user logged in and the recipient's name
			System.out.println("Who would you like to send this message to: ");
			String recipientName = in.next();
			Message m = new Message(name, recipientName);
			in.nextLine();
			String appendText = "";
			//do while loop that prompts the user to enter text for the message body until the user enters a blank then stops appending
			do {
				System.out.println("Enter the body of the message to send or nothing to stop writing to the message");
				appendText = in.nextLine();
				if(!appendText.equals("")) {
					m.append(appendText);
				}
			}while(!appendText.equals(""));
			//delivers the message to the inbox and outbox and prints message out to console
			mailSys.deliver(m);
			System.out.println("Your message has been delivered to" + recipientName + ".");
		}
	}
	
	/**
	 * 
	 * @param mailSys mailsystem used to get the mailbox for the current user and the messages of those mailboxes
	 * @param name String used to check if someone is not logged in
	 * @param messageType String used to determine whether the user wants to recieve messages from outbox or inbox
	 * 
	 * This method is used to print out all the messages in either the persons outbox or inbox depending on what is passed in by main.
	 * Then prints out all the messages to the console.
	 */
	public static void getMessages(MailSystem mailSys, String name, String messageType) {
		if(name.equals("")) {
			System.out.println("Error: you must be logged in to see your messages");
		}
		else {
			mailSys.printMessages(name, messageType);
		}
	}

}
