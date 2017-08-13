import java.util.*;

public class Sentinel_Controlled_Loop {
	
	public static Scanner in = new Scanner(System.in);

	public static void main (String[] args) {
		int x = 0;
		int sum = 0;
		do {
			sum += x;
			System.out.println("Im here");
			x = getInt();
		}while (x > 0);
		System.out.println("The sum of the numbers you entered is: " + sum);
	}
	
	public static Integer getInt() {
		System.out.println("Enter a positive number to add to the sum or a negative number to quit and get the sum.");
		Integer x = null;
		do {
			try {
				x = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error: you did not enter a valid integer.");
				in.nextLine();
			}
		}while(x == null);
		return x;
	}
	
}
