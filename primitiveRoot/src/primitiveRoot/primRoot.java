package primitiveRoot;

public class primRoot {
	
	public static void main(String[] args) {
		int p = 101;
		int n = 5;
		int i = n;
		
		while(i > 1) {
			if((n%i) == 0) {
				if((p%i) == 0) {
					System.out.println("n is not a primitive root of p.");
				}
			}
			i--;
		}
	}

}
