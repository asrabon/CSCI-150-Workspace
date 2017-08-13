import java.util.Scanner;
import java.util.Stack;

/**
 * @programname Lab19
 * @author Anthony Rabon
 * @Date 11/28/16
 * @Class CSCI 150L
 */

public class Lab19 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		System.out.println("Input a word you would like to check if it is a palindrome or *** to quit.");
		String input = in.nextLine();
		while(!input.equals("***")) {
			
			for(int i = 0; i < input.length(); i++) {
				stack.push(input.charAt(i));
			}
			
			String reverse = "";
			while(!stack.isEmpty()) {
				reverse += stack.pop();
			}
			System.out.println("Original Input: " + input + "\nReverse Of Input: " + reverse);
			if(input.equals(reverse)) {
				System.out.println("String is a palindrome");
			}
			else {
				System.out.println("String is not a palindrome");
			}
			
			System.out.println("Input a word you would like to check if it is a palindrome or *** to quit.");
			input = in.nextLine();
			
		}
	}

}
