
public class Card {
	/**
	 * 
	 * @programName Card
	 * @class CSCI 150L
	 * @programmer Anthony Rabon
	 * @lastRevised 10-3-16
	 *
	 */
	
	private String name;
	
	public Card() {
		name = "";
	}
	
	public Card(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isExpired() {
		return false;
	}
	
	public String toString() {
		return "Card holder: " + name ;
	}

}
