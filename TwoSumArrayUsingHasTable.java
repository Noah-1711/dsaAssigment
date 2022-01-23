package dsaassignment;

public class TwoSumArrayUsingHasTable {
	public static void main(String args[]) {
		int arr[] = {2,3,4};
		int sum = 6;
		int arr2[] = new int[2];
		int highindex =arr.length-1;
		
		int leftindex=0;
		while(leftindex<highindex) {
			if(arr[leftindex]+arr[highindex]==sum) {
				arr2[0] = leftindex+1;
				arr2[1] = highindex+1;
				break;
			}
			else if(arr[leftindex]+arr[highindex]>sum) {
				highindex--;
			}
			else {
				leftindex++;
			}
		}
		
		System.out.println(arr2[0]+","+arr2[1]);
		
		}
}
