import java.util.InputMismatchException;
import java.util.Scanner;

public class Prog3 {
	
	/**
	 * 
	 * @programName program 3
	 * @class CSCI 150L
	 * @programmer Anthony Rabon
	 * @lastRevised 9-19-16
	 *
	 */
	
	public static void main(String[] args) {
		//initializes the objects and variables that will be used in the program
		Scanner in = new Scanner(System.in);//creates scanner used for user input
		CashRegister reg = new CashRegister();//creates a CashRegister object that will be used to keep track of items and prices
		double totalSales = 0;//creates a variable that will keep track of the total sales for the day
		System.out.print("N)ew \nA)dd \nT)otal \nD)isplay \nQ)uit \n");
		char userInput = getUserInput (in);//initializes the char to what the user would like to do based on the menu given
		
		//while loop that interacts with the cash register object until the user enters a q or Q to exit the loop
		while(userInput != 'q' && userInput != 'Q') {
			//switch statement that checks what char was entered by the user
			switch(userInput) {
			case 'n': case 'N': totalSales = caseN(reg, totalSales) ; break;//if n was entered it calls the method caseN to handle what should be done
			case 'a': case 'A': reg.addItem(getPrice(in)); break;//if a was entered it calls the addItem method in CashRegister and passes in what the method getPrice returns
			case 't': case 'T': System.out.printf("Total: " + "$" + "%.2f" + "\n", reg.getTotal()); break;//if t was entered it prints out the current total for the customer
			case 'd': case 'D': reg.displayList(); break;//if d was entered it calls the cash register method to display a list
			default : System.out.println("Error: you did not enter a valid option from the menu try again.");
			}//end of switch statement
			userInput = getUserInput(in);//sets user input to what is returned from the getUserInput method
		}//end of while loop
		
		totalSales += reg.getTotal();//adds the current registers total with the totalSales
		System.out.printf("Total sales for the day: $" + "%.2f" + "\n" , totalSales);
		
	}//end of main
	
	/**
	 * 
	 * @param in Scanner used to obtain the user's input
	 * @return c which is a char that contains what they want the program to do next
	 * 
	 * The purpose of this method is to obtain user's input of what they would like the program to do next
	 */
	public static char getUserInput (Scanner in) {
		char c = in.next().charAt(0);//scans the first character of what the user entered and stores it in 
		return c;//returns the char to main which contains the user's input that the scanner scanned
	}

	/**
	 * 
	 * @param reg CashRegister object used to call the methods associated with it
	 * @param totalSales passes in the total sales to add to it before it creates the new register
	 * @return returns totalSales after adding the total of the current register to it
	 * 
	 * The purpose of this method is to handle the case of a n in the switch statement by creating a new register and adding the current register's
	 * total to the totalSales and returning it back to main
	 */
	public static double caseN (CashRegister reg, double totalSales) {
		totalSales += reg.getTotal();//adds the current register's total to the totalSales variable
		reg.clear();//clears the register to reset values
		reg = new CashRegister();//creates a new CashRegister object
		System.out.println("You may begin entering items with your new register.");
		return totalSales;//returns the incremented totalSales back to main
	}//end of caseN method
	
	/**
	 * 
	 * @param in Scanner object used to get user input data
	 * @return the price of the item that was entered by the user
	 * 
	 * The purpose of this method is to prompt the user to enter the price of an item and return that price back to main
	 */
	public static double getPrice (Scanner in) {
		double x = -1.00;//initializes x as a double to -1
		
		//while loop that makes the user enter a double until a valid price was entered
		while(x <= 0){
			try {
				System.out.println("Enter the price of the item you would like to add: ");
				x = in.nextDouble();//sets x equal to next double scanned in
				if (x <= 0 ) {
					throw new InputMismatchException();//throws a InputMismatchException if a negative number was entered
				}//end of if statement
			} catch (InputMismatchException e) {
				System.out.println("Error: you must enter a number that is greater than zero.");
				in.nextLine();//skips to the next line in the scanner
			}//end of try/catch block
		}//end of while loop
		
		return x;//returns x back to main
	}//end of getPrice method
	
}
