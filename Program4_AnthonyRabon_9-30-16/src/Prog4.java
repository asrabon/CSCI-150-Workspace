
public class Prog4 {
	
	/**
	 * 
	 * @programName program 4
	 * @class CSCI 150
	 * @programmer Anthony Rabon
	 * @lastRevised 10-10-16
	 * 
	 *The purpose of this program is to create a mailsystem that contains many people's mailboxes and will create and deliever messages to those
	 *specified mailboxes. Lastly, it will print out the given mailboxes contents.
	 */
	
	public static void main(String[] args) {
		//initializes the mailSystem and the message that will be used in the program
		MailSystem mySystem = new MailSystem();//mail system that will be used to keep track of inboxes and outboxes
		Message m;//message m that will be used throughout the program to create messages to send
		
		//creates a message object to send to Sue and delievers it
		m = new Message("Sam", "Sue");
		m.append("Hello");
		m.append("Goodbye");
		mySystem.deliver(m);
		
		//creates a message object to send to Sam and delivers it
		m = new Message("Sue", "Sam");
		m.append("Hello Sam");
		mySystem.deliver(m);
		
		//creates a message object to send to Mary and delivers it 
		m = new Message("Sue", "Mary");
		m.append("Hello Mary");
		mySystem.deliver(m);
		
		//creates a message object to send to John and delivers it
		m = new Message("Sue", "John");
		m.append("Hello John");
		mySystem.deliver(m);
		
		//Prints out Sam's inbox and outbox and messages
		System.out.println("Sam's inbox");
		mySystem.printMessages("Sam", "inbox");
		System.out.println("\nSam's outbox");
		mySystem.printMessages("Sam", "outbox");
		
		//Prints out Sue's inbox and outbox and messages
		System.out.println("Sue's inbox");
		mySystem.printMessages("Sue", "inbox");
		System.out.println("\nSue's outbox");
		mySystem.printMessages("Sue", "outbox");
		
		//Prints out Mary's inbox and outbox and messages
		System.out.println("Mary's inbox");
		mySystem.printMessages("Mary", "inbox");
		System.out.println("\nMary's outbox");
		mySystem.printMessages("Mary", "outbox");
		
		//Prints out Bill's inbox and outbox and messages
		System.out.println("Bill's inbox");
		mySystem.printMessages("Bill", "inbox");
	}

}
