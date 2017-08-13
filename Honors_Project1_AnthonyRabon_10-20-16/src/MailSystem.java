import java.util.ArrayList;

public class MailSystem {
	
	/**
	 * 
	 * @className MailSystem
	 * @class CSCI 150
	 * @programmer Anthony Rabon
	 * @lastRevised 10-10-16
	 *
	 *This class is used to represent a mail system that contains multiple different people's messages that have been to them and from them.
	 *Contains info such as an arraylist of mailboxes and owner of each mailbox
	 */

	//creates variables that will be used in the class
	private ArrayList<Mailbox> mbList;//ArrayList that will store each person's mailbox
	private boolean mailboxFound;//boolean variable that will be used in the getIndex method to determine if a given mailbox has been found
	private int mailCount;//integer variable used in the printMessages method to keep track of how many messages are in a person's inbox/outbox
	private String mailboxOwner;//string variable that stores the name of the mailbox's owner
	private int senderIndex;//integer variable that stores the index of the message's sender in the Mailbox ArrayList
	private int recipientIndex;//integer variable that stores the index of the message's recipient in the Mailbox ArrayList
	private Mailbox printMessageMailbox;//Mailbox varaiable that will be used to store the reference to a person's mailbox used in the printMessages method
	private String printMessageString;
	
	public MailSystem(){
		//initializes variables that will be used in the program
		mbList = new ArrayList<Mailbox>();
	}
	
	/**
	 * 
	 * @param m Message object m that will be used to send to each mailbox
	 * 
	 * This method's purpose is to take in a Message object as a parameter and deliever it to the sender's and recipient's Mailboxes
	 */
	public void deliver(Message m) {
		senderIndex = getIndex(m.getSender());//sets the variable equal to the integer returned by the getIndex method
		
		//if the integer is -1 then the mailbox wasn't found so the if statement creates a new mailbox for the person and adds the message to that person's mailbox
		if(senderIndex == -1) {
			Mailbox mailbox = new Mailbox(m.getSender());
			mbList.add(mailbox);
			mailbox.addMessage(m);
		}
		//if the integer is anything else the else statement will add the message to that person's mailbox
		else {
			mbList.get(senderIndex).addMessage(m);
		}
		recipientIndex = getIndex(m.getRecipient());//sets the variable equal to the integer returned by the getIndex method
		
		//if the integer is -1 then the mailbox wasn't found so the if statement creates a new mailbox for the person and adds the message to that person's mailbox
		if(recipientIndex == -1) {
			Mailbox mailbox = new Mailbox(m.getRecipient());
			mbList.add(mailbox);
			mailbox.addMessage(m);
		}
		//if the integer is anything else the else statement will add the message to that person's mailbox
		else {
			mbList.get(recipientIndex).addMessage(m);
		}
	}
	
	/**
	 * 
	 * @param owner String variable that contains the owner's name
	 * @param messageType String variable that contains either inbox or outbox depending on what the user want's to print out
	 */
	public String printMessages(String owner, String messageType) {
		printMessageString = "";
		mailCount = 0;
		//if the index of the owner's mailbox is -1 then this means they have no mail so it will print no messages out
		if(getIndex(owner) == -1) {
			return("No messages.\n");
		}
		//else if the messageType is outbox it will iterate through the person's mailbox printing each message they sent to the console
		else if(messageType.equalsIgnoreCase("outbox")) {
			printMessageMailbox = mbList.get(getIndex(owner));//sets this equal to the reference of that person's mailbox
			//iterates over the mailbox printing out any message's the owner sent
			for(int i = 0 ; i < printMessageMailbox.getSize(); i++) {
				if(printMessageMailbox.getMessage(i).getSender().equalsIgnoreCase(owner)) {
					mailCount++;
					printMessageString = printMessageString + printMessageMailbox.getMessage(i).toString() + "\n";
				}
			}
			//if at the end of the for loop the mailCount is 0 this means the Owner has sent no mail to anyone so no messages will print to the console
			if (mailCount == 0) {
				return("No messages.\n");
			}
		}
		//else the messageType is inbox so it will iterate through the person's mailbox printing each message they recieved to the console
		else{
			printMessageMailbox = mbList.get(getIndex(owner));//sets this equal to the reference of that person's mailbox
			//iterates over the mailbox printing out any message's the owner recieved
			for(int i = 0 ; i < printMessageMailbox.getSize(); i++) {
				if(printMessageMailbox.getMessage(i).getRecipient().equalsIgnoreCase(owner)) {
					mailCount++;
					printMessageString = printMessageString + printMessageMailbox.getMessage(i).toString() + "\n";
				}
			}
			//if at the end of the for loop the mailCount is 0 this means the Owner has recieved no mail to anyone so no messages will print to the console
			if (mailCount == 0) {
				return("No messages.\n");
			}
		}
		return printMessageString;
	}
	
	/**
	 * 
	 * @param owner String variable that contains the owner's name
	 * @return the index i of the owner's mailbox
	 * 
	 * This method is used to retrieve the index of the owner's mailbox in the MailSystems ArrayList and returns it back to whoever called it 
	 */
	private int getIndex(String owner) {
		int i = 0;
		mailboxFound = false;
		//while loop that iterates over the MailSystem's mailboxes while the mailbox of the owner hasn't been found and it is in the bounds of the ArrayList
		while(mailboxFound == false && i < mbList.size()) {
			mailboxOwner = mbList.get(i).getOwner();
			//if the mailbox owner of the i(th) position in the ArrayList is equal to the parameter string owner then it returns that as the index of the person's mailbox
			if(mailboxOwner.equalsIgnoreCase(owner)) {
				return i;
			}
			i++;
		}
		//if it gets to the end of the while loop then the mailbox was not found in the ArrayList so the method will return -1
		return -1;
	}

}
