import java.util.Scanner;

/**
 * 
 * @progName Lab15
 * @class CSCI 150L
 * @programmer Anthony Rabon
 * @lastRevised 11-2-16
 *
 */

public class Lab15 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string you would like reversed.");
		String s = in.next();
		System.out.println(reverse(s));
	}
	
	public static String reverse(String s) {
			int n = s.length();
			if(s.length() == 1) {
				return s;
			}
			else {
				return s.charAt(n-1) + reverse(s.substring(0, n-1));
			}
	}

}
