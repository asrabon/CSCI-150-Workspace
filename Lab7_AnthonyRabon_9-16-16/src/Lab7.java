import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7 {

	public static void main (String[] args) {
		VendingMachine[]  vendArray = new VendingMachine[12];
		for (int i = 0; i < 12; i++) {
			vendArray[i] = new VendingMachine(20);
		}
		int userInput = getNum();
		vendArray[userInput].fillUp(10);
		vendArray[userInput].insertToken();
		vendArray[userInput].insertToken();
		System.out.printf("%-10s" + "%15s" + "%20s" + "\n" , "Machine", "Can Count", "Token Count");
		for (int i = 0; i < 12; i++) {
			System.out.printf("%4d" + "%18d" + "%19d" + "\n" , i , vendArray[i].getCanCount() , vendArray[i].getTokenCount());
		}
	}
	
	public static int getNum () {
		Scanner in = new Scanner(System.in);
		int x = -1;
		do {
			try {
				System.out.println("Enter a number 0 through 11 as to which vending machine you would like to fill up and put two tokens into.");
				x = in.nextInt();
				if (x > 12 || x < 0) {
					throw new InputMismatchException();
				}
			}catch (InputMismatchException e) {
				System.out.println("Error you did not enter a number or you entered a number not between 0-11.");
				in.nextLine();
			}
		}while (x < 0 || x > 12);
		return x;
	}
	
}
