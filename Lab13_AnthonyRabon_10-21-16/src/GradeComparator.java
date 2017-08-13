import java.util.Comparator;

public class GradeComparator implements Comparator<Student>{

	public int compare(Student a, Student b) {
		if(a.getGrade() < b.getGrade()) return -1;
		if(a.getGrade() > b.getGrade()) return 1;
		return 0;
	}

}
