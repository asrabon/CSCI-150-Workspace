/**
 * 
 * @programName Person
 * @author Anthony Rabon
 * Date:11/07/16
 * CSCI 150
 */


public class Person {
	
	private String name;
	private String gender;
	private int age;
	
	public Person(String n, String g, int a) {
		name = n;
		gender = g;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Name=" + name + " " + "Gender=" + gender + " " + "Age=" + age;
	}

}
