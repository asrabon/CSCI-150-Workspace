
public class SelectionSorter {
	
	public static void sort(int[] a) {
		for (int i = 0; i < a.length-1 ; i++) {
			int maxPos = maximumPosition(a, i);
			ArrayUtil.swap(a, maxPos, i);
		}
	}
	
	public static int maximumPosition(int[] a, int from) {
		int maxPos = from;
		for(int i = from + 1; i < a.length; i++) {
			if (a[i]  > a[maxPos]) {
				maxPos = i;
			}
		}
		return maxPos;
	}

}
