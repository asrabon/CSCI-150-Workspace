import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @programName Program 1
 * @class CSCI 150
 * @programmer Anthony Rabon
 * @lastRevised 8-30-16
 *
 *The purpose of this program is to read numbers from a text file and calculate the cost of each service for the customer and give the company the
 *total for each person and the total revenue for all the customers combined.
 *
 */

public class Prog1 {

	public static void main(String[] args) throws FileNotFoundException {
		//creating the objects that will be used later in the program such as the input file, the printwriter, and the scanner used to scan the file
		File customerInformation = new File("prog1in.txt");//file object that contains the customer information
		PrintWriter out = new PrintWriter("prog1out.txt");//printwriter object that will cost information to the output file
		Scanner in = new Scanner(customerInformation);//scanner used to scan the information in the file object
		//initialize values for the total for one customer and the total for all customers combined
		double customerTotal = 0.00;//double used to keep track of the total for an individual customer
		double revenueTotal = 0.00;//double used to keep track of the total for every customer combined
		//while loop that iterates over one customer at a time and gathers all the information for the cost of each item
		while(in.hasNextLine()) {
			getCustomerName(in, out);//calls the method getCustomerName which scans the file to get the customers name
			customerTotal += treeRemoval(in, out);//calls the treeRemoval method then sets the customer's total equal to what the method returned plus what the total was before
			customerTotal += treeTrimming(in, out);//calls the treeTrimming method then sets the customer's total equal to what the method returned plus what the total was before
			customerTotal += stumpGrinding(in, out);//calls the stumpGrinding method then sets the customer's total equal to what the method returned plus what the total was before
			out.printf("%-22s" + "$" + "%8.2f" + "\r\n\r\n", "Total: " , customerTotal);
			System.out.printf("%-22s" + "$" + "%8.2f" + "\n\n", "Total: " , customerTotal);
			revenueTotal += customerTotal;//keeps track of the revenue total for all customers combined
			customerTotal = 0;//reset customer total back to 0 for the next customer
		}//end of while loop
		//prints the total revenue out to the console and to the output file
		System.out.printf("%-22s" + "$" + "%8.2f" + "\n", "Total Revenue: ", revenueTotal);
		out.printf("%-22s" + "$" + "%8.2f" + "\n", "Total Revenue: ", revenueTotal);
		//close out the scanner and the printwriter objects
		in.close();
		out.close();
	}//end of main
	
	/**
	 * 
	 * @param in Scanner used to scan the file
	 * @param out PrintWriter used to output to file
	 * 
	 * The purpose of this method is to obtain the customers name from the input file
	 */
	public static void getCustomerName(Scanner in, PrintWriter out) {
		String name = in.nextLine();//sets the string name equal to the line scanned in by the Scanner object
		//prints customer name out to the console and to the output file
		System.out.printf("%-22s" + name + "\n", "Customer: ");
		out.printf("%-22s" + name + "\r\n", "Customer: ");
	}//end of getCustomerName method
	
	/**
	 * 
	 * @param in Scanner used to scan the file
	 * @param out PrintWriter used to output to file
	 * @return removeCost which is the cost to remove the amount of trees specified
	 * 
	 * The purpose of this method is to scan the file to obtain the number of trees that need to be removed then calculate and return that cost.
	 */
	public static double treeRemoval(Scanner in, PrintWriter out) {
		int removedTrees = in.nextInt();//sets the integer removedTrees to the integer scanned in by the Scanner object
		double removeCost = removedTrees * 150.00;//the double removeCost is how much it cost to remove the amount of trees specified
		//prints the tree removal cost out to the console and the output file
		System.out.printf("%-22s" + "$" + "%8.2f" + "\n", "Tree Removal: ", removeCost);
		out.printf("%-22s" + "$" + "%8.2f" + "\r\n", "Tree Removal: ", removeCost);
		return removeCost;//returns removeCost back to main
	}//end of treeRemoval method
	
	/**
	 * 
	 * @param in Scanner used to scan the file
	 * @param out PrintWriter used to output to file
	 * @return trimCost which is the cost to trim the customer's trees
	 * 
	 * The purpose of this method is to scan the file to obtain the amount of hours that it took to trim the customer's trees, calculate the cost
	 * of the trimming and return the cost back to main.
	 */
	public static double treeTrimming(Scanner in, PrintWriter out) {
		double trimHours = in.nextDouble();//sets the double trimHours to the double scanned in by the Scanner object
		double trimCost = trimHours * 50.00;//calculates the cost to trim the trees based on the hours and sets that equal to the trimCost
		//prints the cost to trim the trees out to the console and to the output file
		System.out.printf("%-22s"+ "$" + "%8.2f" + "\n", "Tree Trimming: ", trimCost);
		out.printf("%-22s"+ "$" + "%8.2f" + "\r\n", "Tree Trimming: ", trimCost);
		return trimCost;//returns the trimCost back to main
	}//end of treeTrimming method
	
	public static double stumpGrinding(Scanner in, PrintWriter out) {
		double stumpCost = 0.00;//initializes the cost to grind the stumps to 0
		int stumpDiameter = in.nextInt();//priming read to get a stump diameter from the file
		//while loop that iterates over each integer in the file and adds it to the stumpCost and exits the loop when it encounters a -1
		while(stumpDiameter != -1) {
			//checks to see if the diameter is over 12 inches if it is then it goes into the if statement to handle it
			if (stumpDiameter > 12) {
				stumpCost += (30.00 + (2.00 * (stumpDiameter - 12)));
			}//end of if statement
			//else statement to add 30.00 to the total since the stump was not over 12 inches
			else {
				stumpCost += 30.00;
			}//end of else statement
			stumpDiameter = in.nextInt();//sets stumpDiameter to the next integer in the line
		}//end of while loop
		//prints the stump grinding cost out the the console and to the output file
		System.out.printf("%-22s" + "$" + "%8.2f" + "\n", "Stump Grinding: ", stumpCost);
		out.printf("%-22s" + "$" + "%8.2f" + "\r\n", "Stump Grinding: ", stumpCost);
		//if statement to check if there is another line in the file if there is it goes down to it to get off of the line with stump diameters on it
		if(in.hasNextLine()) {
			in.nextLine();
		}//end of if statement
		return stumpCost;//returns stumpCost back to main
	}//end of the stumpGrinding method
	
}//end of program
