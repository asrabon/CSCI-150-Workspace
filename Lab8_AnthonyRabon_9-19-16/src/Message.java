
public class Message {
	
	private String senderName;
	private String recieverName;
	private String messageBody;
	
	public Message(String sender, String reciever) {
		senderName = sender;
		recieverName = reciever;
		messageBody = "";
	}
	
	public String getSender() {
		return senderName;
	}
	
	public String getRecipient() {
		return recieverName;
	}

	public void append (String appendText) {
		messageBody = messageBody + appendText + "\n";
	}
	
	public String toString () {
		return ("From:" + senderName + "\n" + "To:" + recieverName + "\n \n" + messageBody);
	}
	
}
