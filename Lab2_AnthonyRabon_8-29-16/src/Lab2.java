/**
 * 
 * @programName lab 2
 * @class CSCI 150L
 * @programmer Anthony Rabon
 * @lastRevised 8-29-16
 *
 *The purpose of this program is to take a defined array in main pass it into a method call rotate which rotates all of the values
 *by one position.
 *
 */

public class Lab2 {
	
	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50, 60, 70};
		rotate(array);
		for(int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]: " + array[i]);
		}
	}

	public static void rotate(int[] array) {
		int temp = array[array.length - 1];
		for(int i = array.length-1; i > 0; i--) {
			array[i] = array[i-1];
		}
		array[0] = temp;
	}
	
}
