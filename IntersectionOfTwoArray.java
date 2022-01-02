package dsaassignment;

public class IntersectionOfTwoArray {
	public static void main(String[] args) {

	int arr[] = {1,3,5,7,9,11,13};
	int arr2[] = {4,6,8,9,11,13,15};


	int i=0;
	int j=0;
	while( i<arr.length && j<arr2.length) {

		if(arr[i]==arr2[j]) {
			System.out.println(arr[i]);
			i++;
			j--;

		}else if(arr[i]>arr2[j]) {
			j++;
		}else {
			i++;
		}

	}

	}


}
