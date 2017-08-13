
public class twoDimArrayAddition {

	public static void main (String[] args) {
		int[][] twoDimArray = {{0,1}, {2,3}, {4,5}, {6,7}, {8,9}};
		for (int i = 0; i < twoDimArray.length; i++) {
			System.out.println("The sum of row " + i + " is " + (twoDimArray[i][0] + twoDimArray[i][1]) + ".");
		}
	}
	
}
