
public class Message {
	
	/**
	 * 
	 * @className Message
	 * @class CSCI 150
	 * @programmer Anthony Rabon
	 * @lastRevised 10-10-16
	 *
	 *This class is used to represent a message. It contains the contents of that message and the sender and recievers name.
	 */
	
	//creating variables that will be used in the class
	private String senderName;//String that holds the Sender's name
	private String recieverName;//String that holds the Reciever's name
	private String messageBody;//String that contains the body of the message
	
	public Message(String sender, String reciever) {
		//initializes the variables used in the class
		senderName = sender;
		recieverName = reciever;
		messageBody = "";
	}
	
	/**
	 * 
	 * @return senderName which contains the message's sender
	 * 
	 * This method returns the name of the message's sender back to whoever called it
	 */
	public String getSender() {
		return senderName;
	}
	
	/**
	 * 
	 * @return recieverName which contains the message's recipient
	 * 
	 * This method returns the name of the message's recipient back to whoever called it
	 */
	public String getRecipient() {
		return recieverName;
	}

	/**
	 * 
	 * @param appendText this is the string that will be added to the current message
	 * 
	 * This method takes in a string as a parameter and adds that string to the message body
	 */
	public void append (String appendText) {
		messageBody = messageBody + appendText + "\n";
	}
	
	/**
	 * This method returns a String which contains all the message's info including the sender, reciever, and the message body
	 */
	public String toString () {
		return ("From:" + senderName + "\n" + "To:" + recieverName + "\n \n" + messageBody);
	}
	
}
