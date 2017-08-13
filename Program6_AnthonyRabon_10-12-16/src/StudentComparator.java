import java.util.Comparator;

/**
 * 
 * @className Program 6
 * @author Scott Chernoff
 * @author Anthony Rabon
 * Date:11/03/16
 * CSCI 150
 * 
 * Comparator class used to determine how to sort the students with last name first and first name second
 */

public class StudentComparator implements Comparator<StudentRecord> {
	
	/**
	 * Compares two students to determine what order they go in by sorting with last name first and first name second
	 * @return integer value of what student comes first
	 */
	public int compare(StudentRecord sr1, StudentRecord sr2) {
		String firstname1 = sr1.getFirstName();
		String firstname2 = sr2.getFirstName();
		String lastname1 = sr1.getLastName();
		String lastname2 = sr2.getLastName();
		if(lastname1.compareTo(lastname2) == 0) {
			return firstname1.compareTo(firstname2);
		}
		else {
			return lastname1.compareTo(lastname2);
		}
	}
	
}