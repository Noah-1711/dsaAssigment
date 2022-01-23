package dsaassignment;

public class SlidingWindowMaximum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,-1,-3,5,3,6,7}; 
        int k = 3; 
        int j, max; 
        
        for (int i = 0; i <= arr.length - k; i++) { 
            max = arr[i]; 
            for (j = 1; j < k; j++)  
            { 
                if (arr[i + j] > max) 
                    max = arr[i + j]; 
            } 
            System.out.print(max + " "); 
        }

	}
}
