/**
 * @programname Prog7
 * @author Anthony Rabon
 * @Date 11/22/16
 * @Class CSCI 150
 *
 * public interface that uses the polynomial and term classes to allow the user to create two polynomials p1 and p2
 * and enter as many terms as the users wants to the polynomial then prints out the polynomials
 * lastly adds p2 to p1 then reprints out the added version
 */

public class Prog7 {
	
	public static void main(String[] args) {
		Polynomial p1 = new Polynomial();
		addTerms(p1);
		
		Polynomial p2 = new Polynomial();
		addTerms(p2);
		
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		
		p1.addPolynomial(p2);//p1 = p1 + p2

		System.out.println("p1 + p2: " + p1);
	}
	
	/**
	 * @param p polynomial class to add terms entered by the user to
	 * 
	 * Lets the user enter terms to add to the polynomial until the user enters a 'n' or 'N' to quit entering values
	 */
	public static void addTerms(Polynomial p) {
		char userChoice = 'y';
		while(userChoice != 'n' && userChoice != 'N') {
			int coef = userInput.getInt("Enter the coefficient of the term you want to add.");
			int exp = userInput.getInt("Enter the exponent of the term you want to add.");
			p.addTerm(new Term(coef, exp));
			userChoice = userInput.getChar("Would you like to add another term? y/n");
		}	
	}

}
