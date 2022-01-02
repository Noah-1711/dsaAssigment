package dsaassignment;

public class Sqrt {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,8,9,10};
		int num=8;
		int start=0;
		int end = num;
		int sqrt= sqrtx(num,arr,end,start);
		System.out.println(sqrt);

	}
 private static int sqrtx(int num, int[] arr,int start,int end) {
	 while (start+1 < end) {
        int mid = start +(end-start) / 2;
        int ans=0;

         if (mid * mid == num) {
             return(int)mid;
         }
         if (mid * mid >num) {
            end=mid;
         }
         else {
             start=mid;
         }if(end*end==num) {
        	 return(int)end;
         }
     }
		return (int)start;
	}

}
