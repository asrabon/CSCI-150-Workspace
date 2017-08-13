/**
 * 
 * @programName Player
 * @author Anthony Rabon
 * Date:11/07/16
 * CSCI 150
 */


public class Player extends Person {
	
	int score;
	
	public Player(String n, String g, int a, int score) {
		super(n,g,a);
		this.score = score;
	}
	
	public String toString() {
		return "Name=" + super.getName() + " " + "Gender=" + super.getGender() + " " + "Age=" + super.getAge() + " " + "Score=" + score;
	}

}
