import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @programName Lab17
 * @author Anthony Rabon
 * Date:11/14/16
 * CSCI 150L
 */

public class Lab17 {
	
	public static void main(String[] args) throws FileNotFoundException {
		String[] a = new String[25];
		File strings = new File("lab17.txt");
		Scanner in = new Scanner(strings);
		for(int i = 0; i < a.length; i++) {
			a[i] = in.next();
		}
		in.close();
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]: " + a[i]);
		}
		MergeSorter.sort(a);
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]: " + a[i]);
		}
	}

}
