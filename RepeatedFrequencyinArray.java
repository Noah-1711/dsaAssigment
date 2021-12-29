package dsaassignment;

public class RepeatedFrequencyinArray {
	 public static void main(String[] args) {
		    int[] arr={1, 1, 2, 2, 2, 2, 3};
		     
		    int x = 1;
		    first(arr, x);
		    last(arr, x);
		  }

		   public static void last(int[] a, int x)
		  {
		       int l = 0;
		       int h = a.length-1;
		       int mid = -1;
		       int n   = a.length -1; 
		       while(l<=h)
		       {
		         mid = (l+h)/2;
		         
		         if( (mid == n || a[mid+1] > x) && a[mid] == x)
		         {
		             System.out.println("Last Occurence " + (mid));
		             return;
		         }
		           
		         if(x < a[mid] )
		         {
		             h = mid - 1;
		         } else {
		             l = mid + 1;
		         } 
		       }
		       System.out.println(" Not found ");
		    }
		    
		  public static void first(int[] a, int x)
		  {
		       int l = 0;
		       int h = a.length-1;
		       int mid = -1;
		      
		       while(l<=h)
		       {
		         mid = (l+h)/2;
		         
		         if( (mid == 0 || a[mid-1] < x) && a[mid] == x)
		         {
		             System.out.println("First Occurence " + (mid));
		             return;
		         }
		           
		         if( a[mid] < x)
		         {
		             l = mid + 1;
		         } else {
		             h = mid - 1;
		         } 
		       }
		       System.out.println(" Not found ");
		       return;
		  }

}
