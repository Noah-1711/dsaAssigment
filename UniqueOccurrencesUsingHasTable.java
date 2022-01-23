package dsaassignment;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrencesUsingHasTable {
	static boolean uniqueOccurrences(int[] arr) {
		Arrays.sort(arr);
		HashMap<Integer,Integer> map = new HashMap<>(); 
		for(int i : arr) {
			if(map.containsKey(i)) {
				map.put(i,map.get(i)+1);
				}
			else {
				map.put(i,1);
			}
		}
		Set<Integer> set = new HashSet<>(map.values());
		return map.size() == set.size();
		
	}

	public static void main(String[] args) {

		int[] arr = {1,1,1,2,2,3,3};
		System.out.println(uniqueOccurrences(arr));
		
		

	}
}
