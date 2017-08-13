import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		String fileName = "";
		Scanner in = new Scanner(System.in);
		Scanner fileScan = null;
		ArrayList<Integer> a = new ArrayList<Integer>();
		boolean done = false;
		while (!done) {
			try {
				System.out.println("Enter the name of the text document to read from: ");
				fileName = in.nextLine();
				File numberFile = new File(fileName);
				fileScan = new Scanner(numberFile);
				done = true;
			} catch(FileNotFoundException e) {
				System.out.println("Error: that was not a vaid file name please try again.");
			}
		}
		
		while(fileScan.hasNextInt()) {
				a.add(fileScan.nextInt());
		}
		
		for (int i = (a.size() - 1); i >= 0; i--) {
			System.out.println("a[" + i + "]: " + a.get(i));
		}
		
		Ship ship1 = new Ship ("Queen Sue" , 1999);
		System.out.println(ship1.toString());

	}
}
