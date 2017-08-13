/**
 * 
 * @className userInput
 * @author Scott Chernoff
 * @author Anthony Rabon
 * Date:11/03/16
 * CSCI 150
 * 
 * Class that represent static methods used to get an input from the user and return it back to main such as getting strings, ints, etc.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class userInput 
{
	
	private static Scanner in = new Scanner(System.in);
	/**
	 * 
	 * @param s String s is what you want to print out the console as a prompt for what you want the user to enter
	 * @return Int of the user entered
	 * 
	 * getInt is used to prompt the user to enter a integer then return it back to main used for the menu option and for course sections
	 */
	public static int getInt(String s) 
	{
		boolean done = false;
		int x = 0;
		while(!done) 
		{
			try 
			{
				System.out.println(s);
				x = in.nextInt();
				done = true;
			}
			catch(InputMismatchException e) 
			{
				System.out.println("Error: you did not enter a valid integer try again.");
				in.nextLine();
			}
		}
		in.nextLine();
		return x;
	}
	
	/**
	 * 
	 * @param s String s is what you want to print out the console as a prompt for what you want the user to enter
	 * @return String the user entered
	 * 
	 * getString is used to prompt the user to enter a String then return it back to main used for getting student last name,first name, grade, etc
	 */
	public static String getString(String s) 
	{
		System.out.println(s);
		return in.nextLine();
	}

}