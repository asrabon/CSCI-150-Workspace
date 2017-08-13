import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class for_loop_ints {
	
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = 8;
		ArrayList<Integer> array = new ArrayList<Integer>();
		fillArrayList(array, n);
		printArrayList(array);
		printArrayListBackwards(array);
	}
	
	public static void printArrayList(ArrayList<Integer> array) {
		for (int i = 0; i < array.size(); i++) {
			System.out.println("array[" + i + "]: " + array.get(i));
		}
	}
	
	public static void printArrayListBackwards(ArrayList<Integer> array) {
		for (int i = array.size() - 1; i >= 0; i--) {
			System.out.println("array[" + i + "]: " + array.get(i));
		}
	}
	
	public static Integer getInt() {
		System.out.println("Enter a number.");
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
	
	public static void fillArrayList(ArrayList<Integer> array, int n) {
		int x;
		for(int i = 0; i < n; i++ ) {
			x = getInt();
			array.add(x);
		}
	}
	
}
