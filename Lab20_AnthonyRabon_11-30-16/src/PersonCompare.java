import java.util.Comparator;

/**
 * @classname PersonCompare
 * @author Anthony Rabon
 * @Date 11/30/16
 * @Class CSCI 150L
 */

public class PersonCompare implements Comparator<Person> {

	public int compare(Person p1, Person p2) {
		int compare = p1.getLastName().compareTo(p2.getLastName());
		if (compare == 0) {
			return p1.getFirstName().compareTo(p2.getFirstName());
		}
		return compare;
	}

}
