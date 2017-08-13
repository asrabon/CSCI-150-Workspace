
public class Lab6 {
	
	/**
	 * 
	 * @programName lab 6
	 * @class CSCI 150L
	 * @programmer Anthony Rabon
	 * @lastRevised 9-12-16
	 *
	 */
	public static void main (String[] args) {
		VendingMachine machine1 = new VendingMachine();
		VendingMachine machine2 = new VendingMachine(20);
	      
		machine1.fillUp(3);
	     
		machine1.insertToken();
	    machine1.insertToken();
	    System.out.print("Token count for machine1: ");
	    System.out.println(machine1.getTokenCount());
	    System.out.println("Expected token count: 2"); 
	      
		System.out.print("Can count for machine1: ");
	    System.out.println(machine1.getCanCount()); 
	    System.out.println("Expected can count: 11");
		
		machine1.insertToken();
	    machine1.insertToken();
		System.out.print("Token count for machine1: ");
	    System.out.println(machine1.getTokenCount());
	    System.out.println("Expected token count: 4"); 
	      
		System.out.print("Can count for machine1: ");
	    System.out.println(machine1.getCanCount()); 
	    System.out.println("Expected can count: 9");


		machine2.insertToken();
		System.out.print("Can count for machine2: ");
	    System.out.println(machine2.getCanCount());
	    System.out.println("Expected can count: 19");
	}

}
