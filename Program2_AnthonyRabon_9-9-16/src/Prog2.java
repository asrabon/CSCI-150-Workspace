import java.util.Scanner;

/**
 * 
 * @programName Program 2
 * @class CSCI 150
 * @programmer Anthony Rabon
 * @lastRevised 9-13-16
 *
 *The purpose of this program is to have a bug object that the user can tell to turn, move 1 position, get the current position, or quit
 *
 */

public class Prog2 {
	
	public static void main (String[] args) {
		//creates the objects and initializes the variables that will be utilized later in the program
		Scanner in = new Scanner(System.in);//creates the scanner for getting user input
		Bug movingBug = new Bug(10);//creates the bug object passing in 10 as a parameter for the starting point
		char userInput = getUserInput(in);//initializes the char userInput to what the method getUserInput returns
		
		//while loop that continues calling the methods the user would like to perform on the bug until the user has entered a q to quit the program
		while(userInput != 'q' && userInput != 'Q') {
			//switch statement that checks to see which character the user input and calls the according bug method
			switch (userInput) {
			case 't' : case 'T': movingBug.turn(); break;//checks to see if a t was entered by the user if so it calls the method to turn the bug
			case 'm' : case 'M': movingBug.move(); break;//checks to see if a m was entered by the user if so it calls the method to move the bug
			case 'g' : case 'G': System.out.println("Current position of the bug: " + movingBug.getPosition()); break;//checks to see if a g was entered by the user if so it calls to method to get the position of the bug
			case 'q' : case 'Q': break;//checks to see if a q was entered by the user if so it breaks out of the switch statement then will quit out of the while loop as well
			default : System.out.println("Error: you did not enter a valid option from the menu try again.");//checks to see if a invalid character was put in by the user then displays a error message
			}//end of switch statement
			userInput = getUserInput(in);//calls the getUserInput method to get user input of what they want to do next with the bug
		}//end of while loop
		
		in.close();//closes the scanner object
		
	}//end of main
	
/**
 * 
 * @param in is the scanner used to get the char from the user
 * @return the char c that is used to represent the user input
 * 
 * The purpose of this method is to get a char from the user of what he/she wants the program to do
 */
	public static char getUserInput (Scanner in) {
		System.out.print("t: turn \nm: move \ng: get position \nq: quit \n");
		char c = in.next().charAt(0);//scans the first character of what the user entered and stores it in 
		return c;//returns the char to main which contains the user's input that the scanner scanned
	}

}
