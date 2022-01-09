package dsaassignment;
import java.util.Arrays;

public class MergeSortDescending {
	 static void descOrder(char[] s)
	    {
	        Arrays.sort(s);
	        reverse(s);
	    }
	 
	    static void reverse(char[] a)
	    {
	        int i, n = a.length;
	        char t;
	        for (i = 0; i < n / 2; i++)
	        {
	            t = a[i];
	            a[i] = a[n - i - 1];
	            a[n - i - 1] = t;
	        }
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    { 
	        Character[] arr={'a','x','y','b','A','T','t'};
	        char[] s = arr[].toCharArray();
	        descOrder(s); // function call
	        System.out.println(String.valueOf(s));
	    }
	    
}
