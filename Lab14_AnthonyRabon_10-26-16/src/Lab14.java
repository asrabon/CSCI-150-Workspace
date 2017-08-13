import java.util.Arrays;

public class Lab14 {
	
	/**
	 * 
	 * @programName Lab14
	 * @class CSCI 150
	 * @programmer Anthony Rabon
	 * @lastRevised 10-26-16
	 * 
	 */
	
	public static void main(String[] args) {
		int[] a = ArrayUtil.randomIntArray(20, 100);
		System.out.println(Arrays.toString(a));
		
		SelectionSorter.sort(a);
		
		System.out.println(Arrays.toString(a));
	}

}
