import java.util.Comparator;

public class NameComparator implements Comparator<String> {

	public int compare(String name1, String name2) {
		return name1.compareTo(name2);
	}

}
