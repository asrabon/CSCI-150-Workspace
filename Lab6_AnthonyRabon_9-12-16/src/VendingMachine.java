
public class VendingMachine {

	private int numTokens;
	private int numCans;
	
	public VendingMachine() {
		numCans = 10;
		numTokens = 0;
	}
	
	public VendingMachine (int cans) {
		numCans = cans;
		numTokens = 0;
	}
	
	public void insertToken() {
		if(numCans > 0) {
			numCans--;
			numTokens++;
		}
	}
	
	public void fillUp(int cans) {
		numCans += cans;
	}
	
	public int getCanCount () {
		return numCans;
	}
	
	public int getTokenCount () {
		return numTokens;
	}
	
}
