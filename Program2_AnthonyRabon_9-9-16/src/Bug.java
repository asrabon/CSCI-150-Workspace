/**
 * 
 * @ClassName Bug
 * @author Anthony Rabon
 * @class CSCI 150
 * @lastRevised 9-14-16
 *
 *This is a class that models a bug that has the basic options such as move which moves the bug left or right, turn which changes directions,
 *and get position which returns the current position of the bug. 
 */
public class Bug {
	
	private static final int LEFT = 0, RIGHT = 1;//Sets two variables as finals LEFT and RIGHT and initialize LEFT to 0 and RIGHT to 1 just used for readability later in the class
	private int position;//integer that will keep track of what position the bug is at
	private int direction;//initializes a integer direction which stores whether the bug will move right or left
	
	/**
	 * 
	 * @param initialPosition A integer passed into the constructor from main which is used for the starting point of the bug
	 * 
	 * This constructor will create the bug object with the position of the bug equal to what was passed in by main
	 * and sets the default direction of the bug to RIGHT
	 */
	public Bug(int initialPosition) {
		position = initialPosition;//sets position equal to whatever integer was passed by main
		direction = RIGHT;//sets the direction of the bug to right by default
	}//end of bug constructor
	
	/**
	 * This method turn will check which current direction the bug is facing and change the direction to the direction it was not facing to begin with.
	 */
	public void turn() { 
		switch(direction) {
		case LEFT: direction = RIGHT; break;//if the bug is facing left it will change the direction so the bug faces right
		case RIGHT: direction = LEFT; break;//if the bug is facing right it will change the direction so the bug faces left
		}//end of switch statement
	}//end of turn method
	
	/**
	 * This method move will check which direction the bug is facing and either add one or subtract one depending on the direction it is facing
	 */
	public void move() {
		switch(direction) {
		case LEFT: position--; break;//if the bug is facing left the position will be subtracted by 1
		case RIGHT: position++; break;//if the bug is facing right the position will be added by 1
		}//end of switch statement
	}//end of move method
	
	/**
	 * 
	 * @return the position that the bug is currently at
	 * 
	 * This method getPosition will simply return the current position of the bug back to main
	 */
	public int getPosition() {
		return position;//returns the int position back to main
	}//end of getPosition method

}//end of Bug class
