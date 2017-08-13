import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @programName lab 3
 * @class CSCI 150L
 * @programmer Anthony Rabon
 * @lastRevised 8-31-16
 *
 *The purpose of this method is to get a file name from the user, check if such a file exists, then the line total
 * of each given line then return it to main
 *
 */

public class Lab3 {
	
	public static void main (String[] args) throws FileNotFoundException {
		//initalize file names, scanner and printwriter used in the program
		Scanner in = new Scanner(System.in);
		Scanner fileScanner = null;
		boolean done = false;
		while(!done) {
			try {
				System.out.println("Enter the name of the input file you would like to read from: ");
				String inputFileName = in.nextLine();//name of the file that info will be gotten from
				File numberFile = new File(inputFileName);//creates the file which contains the numbers
				fileScanner = new Scanner(numberFile);//creates the scanner that is used to scan each line in the file
				done = true;
			}catch (FileNotFoundException e) {
				System.out.println("Error: The file was not found please re-enter");
			}
		}
		final String outputFileName = "lab3out.txt";//name of the file the info will be written to
		String fileLine = null;//string that will be used to contain each line in the file we are reading from
		int count = 0;//used to count which line the loop is currently on
		double sum = 0;//used to keep track of the sum of all the lines
		double lineTotal = 0;//keeps track of one line's total
		PrintWriter out = new PrintWriter(outputFileName);//printwriter used to write info to the output file
		
		//while loop to get the total for each line in file
		while (fileScanner.hasNextLine()) {
			count++;
			fileLine = fileScanner.nextLine();
			lineTotal = getLineTotal(fileLine);
			out.printf("Line " + count + ": " + " sum = " + "%5.1f", lineTotal);
			out.println();
			sum += lineTotal;
		}
		
		//
		fileScanner.close();
		out.close();
		
	}//end of main
	
	/**
	 * 
	 * @param lineScanner used as a scanner to scan each item in a given line
	 * @param fileLine the string that contains the information on each line
	 * @return retruns the total for the current line
	 * 
	 * The purpose of this method is to get the line total of each given line then return it to main
	 */
	
	public static double getLineTotal (String fileLine) {
		Scanner lineScanner = new Scanner(fileLine);//creates a scanner that will be used to scan each value in a given line
		double lineTotal = 0;//keeps track of one line's total
		while(lineScanner.hasNextDouble()) {
			lineTotal += lineScanner.nextDouble();
		}
		lineScanner.close();
		return lineTotal;
	}

}