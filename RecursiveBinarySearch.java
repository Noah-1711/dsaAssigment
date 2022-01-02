package dsaassignment;
import java.util.Scanner;

public class RecursiveBinarySearch {
	 public static int binarySearch(int[] arr, int item, int first, int last)
	    {
	        int mid=(first+last)/2;
	        while(first<=last)
	        {
	            if(arr[mid]==item) return mid;
	            else if(arr[mid]>item) return binarySearch
	            (arr,item,first,mid-1);
	            else return binarySearch(arr,item,mid+1,last);
	        }
	        return -1;
	    }
	    public static void main(String[] args)
	   {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter number of elemnts in array:");
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	       System.out.println("Enter array elements");
	       for(int i=0;i<n;i++) arr[i]=sc.nextInt();
	       System.out.println("Enter element to be searched");
	       int item=sc.nextInt();
	       int index=binarySearch(arr, item, 0, n-1);
	       if(index==-1) System.out.println("Item not found");
	       else System.out.println("Item found at index "+index);
	    }

}
