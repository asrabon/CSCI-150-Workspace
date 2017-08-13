
/**
 * @classname Person
 * @author Anthony Rabon
 * @Date 11/30/16
 * @Class CSCI 150L
 */

public class Person {
	
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return "Name: " + firstName + " " + lastName;
	}

}
