package dsaassignment;

public class Binarysearch {

	public static void main(String[] args) {
		

			  int[] arr = {2,3,5,6,9,11,13,15};
			  
			  int start = 0;
			  
			  int target = 11;
			  
			  int end = arr.length-1;
			  
			  int ceiling = ceiling(arr, start, end, target);
			  
			  
			  System.out.println(" ceiling= "+ceiling );
			 

		}

		

		private static int ceiling(int[] arr, int start, int end, int target) {

			while (start <= end) {

				int mid = start + (end - start) / 2;

				if (arr[mid] < target) {

					start = mid + 1;

				} else {
					end = mid - 1;
				}
			}

			return arr[start];
		}




	}


