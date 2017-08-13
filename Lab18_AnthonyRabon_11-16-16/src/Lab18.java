import java.util.LinkedList;
import java.util.ListIterator;

public class Lab18 {
	
	/**
	 * 
	 * @programName Lab18
	 * @author Anthony Rabon
	 * Date:11/16/16
	 * CSCI 150L
	 */
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.addLast("abcd");
		list.addLast("efg");
		list.addLast("h");
		list.addLast("ijk");
		list.addLast("lmn");
		list.addLast("opq");
		list.addLast("rst");
		list.addLast("uvw");
		list.addLast("xyz");
		
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		while(iterator.hasPrevious()) {
			String s = iterator.previous();
			System.out.println(s);
			char firstChar = s.charAt(0);
			if(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u' ) {
				iterator.remove();
			}
		}
		
		System.out.println();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	}

}
