package dsaassignment;
import java.util.ArrayList;
import java.util.Collections;

public class MergeKSortedLists {
	public static void main(String[] args) {
		int[][] lists = {{1,4,5},{1,3,4},{2,6}};
		ArrayList<Integer> arr = new ArrayList<>(); 
		for(int[] i : lists) {
			for(int j:i) {
				arr.add(j);
			}
			
		}
		Collections.sort(arr);
		System.out.println(arr);

	}
}
