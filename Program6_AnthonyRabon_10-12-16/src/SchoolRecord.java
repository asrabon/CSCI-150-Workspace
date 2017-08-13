/**
 * 
 * @author Scott Chernoff
 * @author Anthony Rabon
 * Date:11/03/16
 * CSCI 150
 * Manipulates an Array List of courses
 */
import java.util.ArrayList;
import java.util.Collections;

public class SchoolRecord 
{
private ArrayList<CourseRecord> courses;
	/**
	 * Initializes the instance variable courses
	 */
	public SchoolRecord() 
	{
		courses = new ArrayList<CourseRecord>(); 
	}
	/**
	 * Adding a course to the Array List
	 * @param cr CourseRecord to add to the ArrayList
	 */
	public void addCourse(CourseRecord cr) 
	{
		courses.add(cr);
	}
	/**
	 * Displays all the courses in the Array List
	 */
	public void listCourses() 
	{
		CourseRecord currentCourse;
		for(int i = 0; i < courses.size(); i++) 
		{
			currentCourse = courses.get(i);
			System.out.println(currentCourse.toString() + " Number Enrolled:" + currentCourse.listSize());
		}
	}
	/**
	 * Determines if the course exists and returns the index
	 * @param courseName String to search and find in the ArrayList
	 * @param section integer of the section of the course you are looking for
	 * @return if the course is found returns the index in the arrraylist or -1 if not found
	 */
	public int findCourse(String courseName, int section) 
	{
		int i = 0; //counter for loop
		boolean courseFound = false;
		while(courseFound == false && i < courses.size()) 
		{
			CourseRecord currentCourse = courses.get(i);//reference variable for the current course in the arrayList or courses[i]
			//get name and section of ith course in arrayList
			String className = currentCourse.getCourse();
			int sectionNum = currentCourse.getSection();
			//if the section numbers and class names are equal return index of that arraylist
			if(section == sectionNum && className.equals(courseName)) 
			{
				courseFound = true;
				return i;
			}
			i++;
		}
		return -1;//if course not found return -1
	}
	/**
	 * Adds a student to the course
	 */
	public void enrollStudent() 
	{
		String studentFirstName = userInput.getString("Enter the student's last name.");
		String studentLastName = userInput.getString("Enter the student's first name.");
		String course = userInput.getString("Enter the course name and number you want to enroll this student in.");
		int section = userInput.getInt("Enter the course section.");
		int courseIndex = this.findCourse(course, section);//See if the course exists
		if(courseIndex == -1) 
		{
			System.out.println("Error: the class entered was not found.");
		}
		else //If the course is found add the student to the course
		{
			CourseRecord currentCourse = courses.get(courseIndex);
			currentCourse.addStudent(studentFirstName, studentLastName);
		}
	}
	/**
	 * prompts the user to enter the grade for each student in the class they choose
	 */
	public void enterGrades() 
	{
		String course = userInput.getString("Enter the course name and number.");
		int section = userInput.getInt("Enter the course section.");
		int courseIndex = this.findCourse(course, section);//If the course exists
		if(courseIndex == -1) //Course doesn't exist
		{
			System.out.println("Error: the class entered was not found.");
		}
		else 
		{
			CourseRecord currentCourse = courses.get(courseIndex);
			int listSize = currentCourse.listSize();
			for(int i = 0; i < listSize; i++) 
			{
				StudentRecord currentStudent = currentCourse.getStudent(i);
				String studentGrade = userInput.getString("Enter the grade for " + currentStudent.getFirstName() + " " + currentStudent.getLastName() + ":");
				currentStudent.setGrade(studentGrade);
			}
		}
	}
	/**
	 * Prints the Students enrolled in the course
	 */
	public void displayRoll() 
	{
		String course = userInput.getString("Enter the course name and number.");
		int section = userInput.getInt("Enter the course section.");
		int courseIndex = this.findCourse(course, section);
		if(courseIndex == -1) 
		{
			System.out.println("Error: the class entered was not found.");
		}
		else 
		{
			CourseRecord currentCourse = courses.get(courseIndex);
			int listSize = currentCourse.listSize();
			for(int i = 0; i < listSize; i++) 
			{
				StudentRecord currentStudent = currentCourse.getStudent(i);
				System.out.println(currentStudent.toString());//Prints name and grade of the student
			}
		}
	}
	/**
	 * Sorts the courses by name and section number
	 */
	public void sortCourses() 
	{
		Collections.sort(courses, new CourseComparator());
	}
}
