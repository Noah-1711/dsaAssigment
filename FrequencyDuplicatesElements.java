package dsaassignment;

public class FrequencyDuplicatesElements {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 5, 6, 10, 10, 10, 10, 11, 13, 15, 18 };

		int target = 10;

		int first = firstOcc(nums, target);

		int last = lastOcc(nums, target);

		System.out.println(last-first);

		
	}

	
	private static int firstOcc(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;

		int index = -1;

		while (start <= end) {

			int mid = start + ((end - start) / 2);

			if (target == nums[mid]) {
				index = mid;
				end = mid - 1;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return index;
			
}
	private static int lastOcc(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;

		int index = -1;

		while (start <= end) {

			int mid = start + ((end - start) / 2);

			if (target == nums[mid]) {
				index = mid;
				start = mid + 1;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return index;
	}


	

}
