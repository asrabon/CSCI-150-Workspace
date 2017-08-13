
public class ATMCard extends Card{
	/**
	 * 
	 * @programName ATMCard
	 * @class CSCI 150L
	 * @programmer Anthony Rabon
	 * @lastRevised 10-3-16
	 *
	 */
	
	private String accountNumber;
	private String pin;
	
	public ATMCard(String n, String acctnum, String pnum) {
		super(n);
		accountNumber = acctnum;
		pin = pnum;
	}
	
	public String toString() {
		return (super.toString() + "\nAccount Number: " + accountNumber + "\nPin Number: " + pin + "\n");
	}

}
