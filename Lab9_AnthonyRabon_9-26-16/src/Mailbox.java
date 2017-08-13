import java.util.ArrayList;

public class Mailbox {
	
	private ArrayList<Message> list;
	private String owner;
	
	public Mailbox(String name) {
		owner = name;
		list = new ArrayList<Message>();
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void addMessage(Message m) {
		list.add(m);
	}
	
	public Message getMessage(int i) {
		return list.get(i);
	}
	
	public void removeMessage(int i) {
		list.remove(i);
	}
	
	public int getSize() {
		return list.size();
	}

}
