package dsaassignment;
import java.util.*;

public class TopKFrequentElement {
	  int num; // Store the number
	    int freq; // Store the count of 'number' present in the array

	    TopKFrequentElement () {
	    }

	    TopKFrequentElement (int arg_num, int arg_freq) {
	        num = arg_num;
	        freq = arg_freq;
	    }

	    // Highest frequency element goes at the top.
	    public int[] K_TopMost_Frequent (int[] nums, int k) {

	        // Max-Heap using PriorityQueue to store the objects based on the frequency
	        PriorityQueue<TopKFrequentElement> pq_mostfreq = new PriorityQueue<>((obj_x, obj_y) -> Integer.compare(obj_y.freq, obj_x.freq));

	        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

	        int[] result = new int[k];

	        // Store the frequency of all the numbers in a map.
	        for (int n : nums) {
	            if (freq.get(n) != null) {
	                int count = freq.get(n);
	                freq.put(n, count+1);
	            } else {
	                freq.put(n, 1);
	            }
	        }

	        // Create a max (frequency) heap from the entries stored in the map.
	        freq.forEach ((key, value) -> pq_mostfreq.add(new TopKFrequentElement(key, value)));

	        // Store the top-most k elements from the max heap into the vector
	        int count = 0;
	        while (count < k && !pq_mostfreq.isEmpty()) {
	        	TopKFrequentElement obj = pq_mostfreq.remove();
	            result[count] = obj.num;
	            count++;
	        }

	        return result;
	    }

	    public static void main (String[] args) {

	        int[] nums = { 1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 4, 10, 10, 10, 10 };

	        System.out.print("Array numbers : ");
	        for (int n : nums)
	            System.out.print(n + " ");

	        System.out.println("\nFetching most frequent k elements in the array.");
	        System.out.print("Enter k : ");

	        Scanner sc = new Scanner(System.in);
	        int k = sc.nextInt();

	        TopKFrequentElement obj = new TopKFrequentElement();

	        int[] result = obj.K_TopMost_Frequent(nums, k);
	        for (int n : result)
	            System.out.print(n + " ");
	    }

}
