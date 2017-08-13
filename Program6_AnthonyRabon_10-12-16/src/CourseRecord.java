/**
 * 
 * @author Scott Chernoff
 * @author Anthony Rabon
 * Date:11/03/16
 * CSCI 150
 * Creates a course and has the students records of each course
 */
import java.util.ArrayList;
public class CourseRecord 
{
	private ArrayList<StudentRecord> list; //Array List full of students
	private String course;//String that contains the name of the course
	private int section;//integer that represents the section number of the course 
	
	/**
	 * 
	 * @param course String that represents the name of the course
	 * @param section Intger used to represent the section number of that course
	 * 
	 * Initialize the variables used in the class 
	 */
	public CourseRecord(String course, int section)
	{
		this.course = course;
		this.section = section;
		list = new ArrayList<StudentRecord>();
	}
	/**
	 * 
	 * @return instance variable course
	 */
	public String getCourse()
	{
		return course;
	}
	/**
	 * Gets the section of the course
	 * @return instance variable section
	 */
	public int getSection()
	{
		return section;
	}
	/**
	 * 
	 * @param i integer that represents where you want to get a student from in the arrayList
	 * @return the StudentRecord found in that position of the arrayList
	 * gets the studentrecord of one student dependent on the integer passed in
	 */
	public StudentRecord getStudent(int i) {
		return list.get(i);
	}
	/**
	 * Adds a new student to the course
	 * @param firstName String used to represent the first name of the student
	 * @param lastName String used to represent the last name of the student
	 */
	public void addStudent(String firstName, String lastName)
	{
		list.add(new StudentRecord(firstName, lastName));
	}
	/**
	 * Gets the size of the Array List
	 * @return Enrolled students
	 */
	public int listSize() 
	{
		return list.size();
	}
	/**
	 * @return Course name and section
	 */
	public String toString()
	{
		return course + " " + section;
	}
}
