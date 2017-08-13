import java.util.Scanner;

public class stringScanner {
	
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a string.");
		String s = in.nextLine();
		in.close();
		Scanner stringScan = new Scanner(s);
		int count = 0;
		while(stringScan.hasNext()) {
			stringScan.next();
			count++;
		}
		stringScan.close();
		System.out.println("There was " + count + " amount of words in the string.");
	}

}
