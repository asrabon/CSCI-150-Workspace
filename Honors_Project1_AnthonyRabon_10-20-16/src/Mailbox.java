import java.util.ArrayList;

public class Mailbox {
	
	/**
	 * 
	 * @className Mailbox
	 * @class CSCI 150
	 * @programmer Anthony Rabon
	 * @lastRevised 10-10-16
	 *
	 *This class is used to represent a email mailbox that contains the name of the owner and all the Messages that have been sent to and from that Mailbox
	 */
	
	private ArrayList<Message> list;//creates an arrayList that will store the messages for each user
	private String owner;//String that will hold the name of the mailbox's owner
	
	public Mailbox(String name) {
		//initializes the variables that will be used throughout the class
		owner = name;
		list = new ArrayList<Message>();
	}
	
	/**
	 * 
	 * @return owner which contains the owner of the mailbox
	 * 
	 * This method returns the name of the owner of the mailbox back to whoever called it
	 */
	public String getOwner() {
		return owner;
	}
	
	/**
	 * 
	 * @param m this is the Message object that will be used in the method
	 * 
	 * This method takes in a Message object as a parameter then adds it into the list array which contains message's of this person's mailbox
	 */
	public void addMessage(Message m) {
		list.add(m);
	}
	
	/**
	 * 
	 * @param i an integer that will be used in the method
	 * @return a Message object back to whoever called the method
	 * 
	 * This method takes in a integer as a parameter then returns the message object that is located in that position of the Message ArrayList
	 */
	public Message getMessage(int i) {
		return list.get(i);
	}
	
	/**
	 * 
	 * @param i an integer that will be used in the method
	 * 
	 * This method takes in a integer as a parameter then removes the message object located in that position of the Message ArrayList
	 */
	public void removeMessage(int i) {
		list.remove(i);
	}
	
	/**
	 * 
	 * @return an integer which represents the size of the ArrayList
	 * 
	 * this method returns the size of the message ArrayList to whoever called it
	 */
	public int getSize() {
		return list.size();
	}

}
