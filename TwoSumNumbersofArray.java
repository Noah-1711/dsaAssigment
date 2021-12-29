package dsaassignment;

public class TwoSumNumbersofArray {
	 public static void main(String[] args)
	    {
	        int[] num = {2,7,11,5};
	        int n = 9;
	        int[] answer = new int[2];
	        answer = twoSum(num,n);
	        if(answer != null)
	            for(int i=0;i<2;i++)
	                System.out.printf( answer[i] +" ");
	    }


	    public static int[] twoSum(int[] numbers, int target)
	    {
	        for (int i = 0; i < numbers.length; i++) 
	        {
	            for (int j = i + 1; j < numbers.length; j++) 
	            {
	                if (numbers[j] == target - numbers[i]) 
	                {
	                    if(numbers[i] < numbers[j])
	                        return new int[] { i+1, j+1};
	                }
	            }
	        }
	        return null;
	    }

}
