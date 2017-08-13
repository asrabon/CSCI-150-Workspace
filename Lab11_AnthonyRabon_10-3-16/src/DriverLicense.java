import java.util.Calendar;

public class DriverLicense extends Card{
	/**
	 * 
	 * @programName DriverLicense
	 * @class CSCI 150L
	 * @programmer Anthony Rabon
	 * @lastRevised 10-3-16
	 *
	 */
	
	private int expirationYear;
	private int currentYear;
	
	public DriverLicense(String n, int expyear) {
		super(n);
		expirationYear = expyear;
	}
	
	public boolean isExpired() {
		currentYear = Calendar.getInstance().get(Calendar.YEAR);
		if(currentYear > expirationYear) {
			return true;
		}
		return false;
	}

	public String toString() {
		return (super.toString() + "\nExpiration Year: " + expirationYear + "\n");
	}
	
}
