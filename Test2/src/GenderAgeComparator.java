import java.util.Comparator;

/**
 * 
 * @programName GenderAgeComparator
 * @author Anthony Rabon
 * Date:11/07/16
 * CSCI 150
 */

public class GenderAgeComparator implements Comparator<Person> {

	public int compare(Person person1, Person person2) {
		String person1Gender = person1.getGender();
		String person2Gender = person2.getGender();
		int person1Age = person1.getAge();
		int person2Age = person2.getAge();
		if(person1Gender.compareTo(person2Gender) == 0) {
			if(person1Age < person2Age) { return -1; }
			if(person1Age > person2Age) { return 1; } 
		}
		return person1Gender.compareTo(person2Gender);
	}

}
