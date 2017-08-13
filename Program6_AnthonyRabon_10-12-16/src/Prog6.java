/**
 * 
 * @programName Program 6
 * @author Scott Chernoff
 * @author Anthony Rabon
 * Date:11/03/16
 * CSCI 150
 * Menu Driven main method for program 6 to get school courses from a file then lets the user enter and see data
 * about classes or students in classes until the user wants to quit
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prog6
{
	public static void main(String[] args) throws FileNotFoundException
	{
		
		int userChoice;//integer used to represent what option the user wants to do
		SchoolRecord sr = new SchoolRecord();//School record used to keep track of all Course Records
		File courseList = new File("prog6.txt");//file with all course listings
		Scanner in = new Scanner(courseList);//scanner used to scan the courseList file
		CourseRecord courseRecord;//CourseRecord object used to contain information about courses scanned from file
		//while the file still has another line get the information of that course, create a new course record, and add course to school record
		while(in.hasNextLine()) {
			String course = in.next() + " " + in.next();
			int sectionNumber = in.nextInt();
			courseRecord = new CourseRecord(course, sectionNumber);
			sr.addCourse(courseRecord);
			if(in.hasNextLine()) {
				in.nextLine();
			}
		}
		in.close();
		userChoice = userInput.getInt("1.List all courses\n2.Enroll a student in one or more courses\n3.Sort courses\n4.Enter grades\n5.Display class roll\n6.Quit");//Menu of options
		//sentinel controlled while loop to do the menu options until the user enters 6
		while(userChoice != 6)
		{
			switch(userChoice) 
			{
			case 1: sr.listCourses(); break;
			case 2: sr.enrollStudent(); break;
			case 3: sr.sortCourses(); break;
			case 4: sr.enterGrades(); break;
			case 5: sr.displayRoll(); break;
			case 6: break;
			default: System.out.println("Error: you did not enter a valid number option.");
			}
			userChoice = userInput.getInt("1.List all courses\n2.Enroll a student in one or more courses\n3.Sort courses\n4.Enter grades\n5.Display class roll\n6.Quit");
		}
	}
}
