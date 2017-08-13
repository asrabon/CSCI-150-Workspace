/**
 * 
 * @author Scott Chernoff
 * @author Anthony Rabon
 * Date:11/03/16
 * CSCI 150
 * Compares two courses to determine which one comes first
 */
import java.util.Comparator;
public class CourseComparator implements Comparator<CourseRecord>
{
	/**
	 * Compares two Courses by the course name first and if the course names are equal then compares by section number
	 * @return integer value of what course comes first
	 */
	public int compare(CourseRecord cr1, CourseRecord cr2) 
	{
		String course1 = cr1.getCourse();
		String course2 = cr2.getCourse();
		int section1 = cr1.getSection();
		int section2 = cr2.getSection();
		if(course1.compareTo(course2) == 0) 
		{
			if(section1 > section2) return 1;
			if(section1 < section2) return -1;
			return 0;
		}
		else 
		{
			return course1.compareTo(course2);
		}
	}
}
