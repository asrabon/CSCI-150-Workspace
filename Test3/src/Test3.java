import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class Test3 {
	
	/**
	 * 
	 * @programName Test 3
	 * @author Anthony Rabon
	 * Date:12/2/16
	 * CSCI 150
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int userNum = 0;
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		System.out.println("Enter a value to put in the linked list or \"9999\" to stop inputing values: ");
		userNum = in.nextInt();
		while(userNum != 9999) {
			linkedList.add(userNum);
			System.out.println("Enter a value to put in the linked list or \"9999\" to stop inputing values: ");
			userNum = in.nextInt();
		}
		
		ListIterator<Integer> iterator = linkedList.listIterator();
		int i = 0;
		while(iterator.hasNext()) {
			System.out.println("LinkedList[" + i + "]: " + iterator.next());
			i++;
		}
		
		iterator = linkedList.listIterator();
		Integer currentNum = 0;
		while(iterator.hasNext()) {
			currentNum = iterator.next();
			if(currentNum < 0) {
				iterator.remove();
			}
		}
		
		System.out.println("LinkedList after removing all negative numbers: ");
		iterator = linkedList.listIterator();
		i = 0;
		while(iterator.hasNext()) {
			System.out.println("LinkedList[" + i + "]: " + iterator.next());
			i++;
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		iterator = linkedList.listIterator();
		currentNum = 0;
		while(iterator.hasNext()) {
			currentNum = iterator.next();
			stack.push(currentNum);
		}
		
		i = 0;
		while(!stack.isEmpty()) {
			System.out.println("Stack[" + i + "]: " + stack.pop());
			i++;
		}
		
	}

}
