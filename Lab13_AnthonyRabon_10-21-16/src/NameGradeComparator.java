import java.util.Comparator;

public class NameGradeComparator implements Comparator<Student> {

	public int compare(Student a, Student b) {
		String aName = a.getName();
		int aGrade = a.getGrade();
		String bName = b.getName();
		int bGrade = b.getGrade();
		if(aName.compareTo(bName) < 0) return -1;
		if(aName.compareTo(bName) > 0) return 1;
		if(aGrade < bGrade ) return -1;
		if(aGrade > bGrade ) return 1;
		return 0;
	}

}
