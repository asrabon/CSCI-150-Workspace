
public class IDCard extends Card{
	/**
	 * 
	 * @programName IDCard
	 * @class CSCI 150L
	 * @programmer Anthony Rabon
	 * @lastRevised 10-3-16
	 *
	 */
	
	private String idNumber;
	
	public IDCard(String n, String id){
		super(n);
		idNumber = id;
	}
	
	public String toString() {
		return (super.toString() + "\nId Number: " + idNumber + "\n");
	}

}
