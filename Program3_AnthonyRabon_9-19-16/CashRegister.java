import java.util.ArrayList;

/**
 * 
 * @programName CashRegister
 * @class CSCI 150L
 * @programmer Anthony Rabon
 * @lastRevised 9-19-16
 *
 *The purpose of this class is to imitate functions a normal register would have
 */

public class CashRegister {
	
	private ArrayList<Double> itemList;//creates a ArrayList of doubles that will store items entered in by the user
	private double regTotal;//creates a double that will keep track of the registers total
	
	/**
	 * Constructor for the CashRegister class which just initializes all the variables that will be used in the class
	 */
	public CashRegister() {
		itemList = new ArrayList<Double>();//initializes the ArrayList
		regTotal = 0.00;//initializes regTotal to 0.00
	}//end of constructor
	
	/**
	 * 
	 * @param itemPrice a double used to represent the price of any item the user wanted to enter
	 * 
	 * The purpose of this method is to add a item to the itemList arraylist and add the itemPrice to the registers total
	 */
	public void addItem (double itemPrice) {
		regTotal += itemPrice;//sets the regTotal equal to the regTotal plus the new item's price
		itemList.add(itemPrice);//adds the itemPrice to the itemList arrayList
	}//end of addItem method
	
	/**
	 *@return the registers current total
	 *The purpose of this method is to return the registers total back to main
	 */
	public double getTotal() {
		return regTotal;//returns regTotal back to main
	}//end of getTotal method

	/**
	 * @return how many items have been entered into the cash register
	 * 
	 * The purpose of this method is to return the amount of items have been entered into the cash register
	 */
	public int getCount() {
		return itemList.size();//returns the size of the arrayList to main
	}//end of getCount method
	
	/**
	 * The purpose of this method is to print out each items price that is in the arrayList and print out the number of items and total
	 */
	public void displayList () {
		for(int i = 0; i < itemList.size(); i++) {
			System.out.printf("%10.2f" + "\n", itemList.get(i));
		}
		System.out.println("------------\n");
		System.out.printf("%10.2f" + " Total\n" , this.getTotal());
		System.out.printf("%19s" + this.getCount() + "\n" , "Number items: ");
	}//end of displayList method
	
	/**
	 * The purpose of this method is to clear out all the items that are currently in the itemList arrayList
	 */
	public void clear () {
		itemList.clear();//clears items out of array list
		regTotal = 0;//sets the regTotal back to 0
	}//end of clear method
	
}
