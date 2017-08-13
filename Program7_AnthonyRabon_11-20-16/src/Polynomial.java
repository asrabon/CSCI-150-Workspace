import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @classname Polynomial
 * @author Anthony Rabon
 * @Date 11/22/16
 * @Class CSCI 150
 *
 * Class that is used to represent a polynomial in math that is an aggregation of terms such as "5x^4"
 * so the polynomial would be something such as "5x^4 + 3x^2 - 87"
 */

public class Polynomial {
	
	private LinkedList<Term> list;//linkedlist that stores a list of terms that are in the polynomial
	private ListIterator<Term> iterator;//list iterator that is used to search, sort and go through the polynomial
	
	/**
	 * constructor that initializes the linkedlist and list iterator that will be used in the class
	 */
	public Polynomial() {
		list = new LinkedList<Term>();
		iterator = list.listIterator();
	}
	
	/**
	 * 
	 * @param t Term class to be added to the polynomial class' linked list
	 * 
	 * Add term method that adds a term passed in to the linked list of the polynomial class
	 * adds it in the correct order which is sorted by the number of the exponent and if there is already an exponent with the same number
	 * it will add the coefficients together
	 */
	public void addTerm(Term t) {
		int addingExp = t.getExponent();
		int addingCoef = t.getCoefficient();
		if(list.size() == 0) {
			list.add(t);
		}
		else{
			iterator = list.listIterator();
			boolean done = false;
			while(iterator.hasNext() && !done) {
				Term currentTerm = iterator.next();
				int currentExp = currentTerm.getExponent();
				int currentCoef = currentTerm.getCoefficient();
				if(addingExp == currentExp) {
					currentTerm.setCoefficient(currentCoef + addingCoef);
					done = true;
				}
				else if(addingExp > currentExp) {
					iterator.previous();
					iterator.add(t);
					done = true;
				}
			}
			if(done == false) {
				list.addLast(t);
			}
		}
	}
	
	/**
	 * 
	 * @return listiterator for the linked list
	 * 
	 * private method used to get the listiterator for the polynomial to iterate through the given polynomial's terms
	 * used for addpolynomial method
	 */
	private ListIterator getIterator() {
		return list.listIterator();
	}
	
	/**
	 * @return size of the linkedlist
	 */
	private int getSize() {
		return list.size();
	}
	
	/**
	 * @param addPolynomial polynomial class that is passed in to add together with the current polynomial
	 * 
	 * Add polynomial method used to add two polynomial's together
	 * This is done by get the listiterator for the addPolynomial class
	 * then iterates through a for loop adding each term in the addPolynomial to the current polynomial
	 */
	public void addPolynomial(Polynomial addPolynomial) {
		ListIterator<Term> addIterator = addPolynomial.getIterator();
		int listSize = addPolynomial.getSize();
		for(int i = 0; i < listSize; i++) {
			Term currentTerm = addIterator.next();
			this.addTerm(currentTerm);
		}
	}
	
	/**
	 * @return returns a string representation of the polynomial class
	 */
	public String toString() {
		String s = "";
		iterator = list.listIterator();
		Term currentTerm = iterator.next();
		int currentCoef = currentTerm.getCoefficient();
		int currentExp = currentTerm.getExponent();
		if(currentExp > 1 || currentExp <= -1) {
			s = s + currentCoef + "x^" + currentExp;
		}
		else if(currentExp == 1) {
			s = s + currentCoef + "x";
		}
		else {
			s = s + currentCoef;
		}
		while(iterator.hasNext()) {
			currentTerm = iterator.next();
			currentCoef = currentTerm.getCoefficient();
			currentExp = currentTerm.getExponent();
			if(currentCoef == 0) {
				
			}
			else if(currentCoef == 1 || currentCoef == -1) {
				if(currentCoef < 0) {
					s = s + " - ";
					currentCoef = Math.abs(currentCoef);
				}
				else {
					s = s + " + ";
				}
				if(currentExp > 1 || currentExp <= -1) {
					s = s + "x^" + currentExp;
				}
				else if(currentExp == 1) {
					s = s + "x";
				}
				else {
					s = s + currentCoef;
				}
			}
			else {
				if(currentCoef < 0) {
					s = s + " - ";
					currentCoef = Math.abs(currentCoef);
				}
				else {
					s = s + " + ";
				}
				if(currentExp > 1 || currentExp <= -1) {
					s = s + currentCoef + "x^" + currentExp;
				}
				else if(currentExp == 1) {
					s = s + currentCoef + "x";
				}
				else {
					s = s + currentCoef;
				}
			}
		}
		return s;
	}
	
}
