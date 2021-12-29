package dsaassignment;


public class MinMaxRecursion {

	static int FindMax(int arr[],int n)
	{
		if(n==1)
			return arr[0];
	    return Math.max(arr[n-1], FindMax(arr, n-1));
	}
	 static int FindMin(int arr[],int n)
	{
		 if(n==1)
				return arr[0];
		    return Math.min(arr[n-1], FindMin(arr, n-1));
	}
	public static void main(String[] args) {
           int arr[]= {1,-1,0,2,-2,3,-3,4,-4};
	    int n,i;
	    n=arr.length;
	   
	   System.out.println("Maximum Element of the array is: "+FindMax(arr,n));
	    System.out.println("Minimum Element of the array is: "+FindMin(arr,n));
	}

}
