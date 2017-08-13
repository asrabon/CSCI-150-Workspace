import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * @programName Lab16
 * @author Anthony Rabon
 * Date:11/10/16
 * CSCI 150
 */

public class Lab16 {
	
	public static void main(String[] args) throws IOException, MalformedURLException {
	     ArrayList<String> lastNames = new ArrayList<String>();
	     URL url = new URL("http://www2.census.gov/topics/genealogy/1990surnames/dist.all.last");
		 Scanner urlIN = new Scanner(url.openStream());
		 while(urlIN.hasNextLine()) {
			 lastNames.add(urlIN.next());
			 urlIN.nextLine();
		 }
		 Collections.sort(lastNames, new NameComparator());
		 Scanner in = new Scanner(System.in);
		 guessName(lastNames, in);
	}
	
	public static void guessName(ArrayList<String> lastNames, Scanner in) {
		char isCorrect = 'N';
		char comeBefore;
		int high = lastNames.size();
		int low = 0;
		int mid;
		String guessName;
		while(isCorrect != 'y' && isCorrect != 'Y' && high > low) {
			mid = (high + low) / 2;
			guessName = lastNames.get(mid);
			System.out.println("Is your last name: " + guessName + "? Y/N");
			isCorrect = in.next().charAt(0);
			if(isCorrect  != 'Y' && isCorrect != 'y') {
				System.out.println("Does your name come before " + guessName + " in the dictionary? Y/N");
				comeBefore = in.next().charAt(0);
				if(comeBefore == 'y' || comeBefore == 'Y') {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
		}
		if(isCorrect != 'y' && isCorrect != 'Y') {
			System.out.println("Your name was not found in the list.");
		}
	}

}
