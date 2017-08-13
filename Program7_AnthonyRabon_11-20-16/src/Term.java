/**
 * @classname Term
 * @author Anthony Rabon
 * @Date 11/22/16
 * @Class CSCI 150
 *
 * Class that is used to represent a term that would be found in a polynomial such as "5x^4"
 * Consists of the coefficient in front of the x and the exponent the x is to.
 */


public class Term {
	
	private int coefficient;//integer used to represent the coefficient of the term
	private int exponent;//integer used to represent the exponent of the term
	
	/**
	 * 
	 * @param coef integer used to initialize the coefficient for the term class
	 * @param exp integer used to initialize the exponent for the term class
	 * 
	 * Constructor that initializes the values of the instance of the term class
	 */
	public Term(int coef, int exp) {
		coefficient = coef;
		exponent = exp;
	}
	
	/**
	 * @return coefficient of the term
	 */
	public int getCoefficient() {
		return coefficient;
	}
	/**
	 * @param coefficient integer used to represent the coefficient
	 * 
	 * Method used to set the coefficient of the current term to what is passed in by the method
	 */
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	/**
	 * @return exponent of the term
	 */
	public int getExponent() {
		return exponent;
	}
	/**
	 * @param exponent integer used to represent the exponent
	 * 
	 * Method used to set the exponent of the current term to what is passed in by the method
	 */
	public void setExponent(int exponent) {
		this.exponent = exponent;
	}

}
