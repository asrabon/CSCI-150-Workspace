import java.util.Set;
import java.util.TreeSet;

/**
 * @programname Lab20
 * @author Anthony Rabon
 * @Date 11/30/16
 * @Class CSCI 150L
 */

public class Lab20 {
	
	public static void main (String[] args) {
		TreeSet<Person> mySet = new TreeSet<Person>(new PersonCompare());
		mySet.add(new Person("Sally", "Brown"));
		mySet.add(new Person("Fred", "Kelly"));
		mySet.add(new Person("Bill", "Akins"));
		mySet.add(new Person("Julie", "Wilkins"));
		mySet.add(new Person("James", "Langdon"));
		
		for (Person p : mySet) {
			System.out.println(p);
		}
		
	}

}
