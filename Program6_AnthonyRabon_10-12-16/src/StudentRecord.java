/**
 * 
 * @author Scott Chernoff
 * @author Anthony Rabon
 * Date:11/03/16
 * CSCI150
 * Name and grade of a student
 */
public class StudentRecord 
{
	private String firstName;
	private String lastName;
	private String grade;
	
	/**
	 * 
	 * @param last last name of the student
	 * @param first first name of the student
	 * 
	 * Constructor that sets the student first name and last name equal to the last name and first name passed into the constructor
	 */
	public StudentRecord(String last, String first)
	{
		lastName = last;
		firstName = first;
		grade = "";
		
	}
	/**
	 * 
	 * @return First name of student
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 * @return Last name of student
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	 * sets grade of the student
	 * @param grade String variable used to set the current grade to whatever was passed in
	 */
	public void setGrade(String grade)
	{
		this.grade = grade;
	}
	/**
	 * @return students grade
	 */
	public String getGrade()
	{
		return grade;
	}
	/**
	 * @return Name and grade of the student
	 */
	public String toString()
	{
		if(grade == "") {
			return firstName + " " + lastName + " " + "N/A";
		}
		return firstName + " " + lastName + ":" + grade;
	}
	
}
