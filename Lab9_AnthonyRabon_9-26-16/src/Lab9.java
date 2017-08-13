
public class Lab9 {
	
	public static void main(String[] args) {
		Mailbox inbox = new Mailbox("Anthony");
		Message m1 = new Message("Jane" , "Anthony");
		m1.append("Hey how are you today?");
		inbox.addMessage(m1);
		Message m2 = new Message("Joe" , "Anthony");
		m2.append("Did you get your homework for CSCI 150?");
		inbox.addMessage(m2);
		Message m3 = new Message("Kamron" , "Anthony");
		m3.append("You want to hang out today?");
		inbox.addMessage(m3);
		for (int i = 0; i < inbox.getSize(); i++) {
			System.out.println(inbox.getMessage(i).toString());
		}
		inbox.removeMessage(1);
		for (int i = 0; i < inbox.getSize(); i++) {
			System.out.println(inbox.getMessage(i).toString());
		}
	}

}
