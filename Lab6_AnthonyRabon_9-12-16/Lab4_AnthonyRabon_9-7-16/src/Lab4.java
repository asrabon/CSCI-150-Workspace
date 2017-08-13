
public class Lab4 {
	
	public static void main(String[] args) {
		Counter tally = new Counter();
		tally.count();
		tally.count();
		tally.count();
		tally.count();
		tally.count();
		tally.undo();
		tally.undo();
		System.out.println("Count: " + tally.getValue());
		Counter tally1 = new Counter(2);
		tally1.count();
		tally1.count();
		tally1.count();
		System.out.println("Count for second Counter: " + tally1.getValue());
	}

}
