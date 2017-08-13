import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @programName Test 2
 * @author Anthony Rabon
 * Date:11/07/16
 * CSCI 150
 */


public class Test2 {
	
	public static void main(String[] args) {
		
		Person[] list = new Person[6];
		list[0] = new Person("Sam", "M", 20);
		list[1] = new Person("Sue", "F", 18);
		list[2] = new Person("Tom", "M", 19);
		list[3] = new Person("Ann", "F", 16);
		list[4] = new Person("Bill", "M", 15);
		list[5] = new Person("Kim", "F", 14);
		
		Arrays.sort(list, new GenderAgeComparator());
		
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = in.next();
		System.out.println("Enter a gender: ");
		String gender = in.next();
		System.out.println("Enter a age: ");
		int age = in.nextInt();
		System.out.println("Enter a score: ");
		int score = in.nextInt();
		
		Person player = new Player(name, gender, age, score);
		System.out.println(player);
		
	}

}
