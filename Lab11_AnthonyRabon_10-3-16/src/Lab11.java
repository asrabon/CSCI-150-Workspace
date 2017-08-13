
public class Lab11 {
	/**
	 * 
	 * @programName lab 11
	 * @class CSCI 150L
	 * @programmer Anthony Rabon
	 * @lastRevised 10-3-16
	 *
	 */

	public static void main(String[] args) {
		Card card = new Card("John Doe");
		System.out.println(card + "\n");
		
		IDCard id = new IDCard("Sam Smith" , "99999");
		System.out.println(id);
		
		ATMCard atm = new ATMCard("Sue Jones" , "1111", "123");
		System.out.println(atm);
		
		DriverLicense license = new DriverLicense("Jane Smith", 2014);
		System.out.println(license);
		System.out.println("Driver License expired: " + license.isExpired());
	}
	
}
