import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	public int compare(Student a, Student b) {
		String aName = a.getName();
		String bName = b.getName();
		if(aName.compareTo(bName) < 0) return -1;
		if(aName.compareTo(bName) > 0) return 1;
		return 0;
	}

}
