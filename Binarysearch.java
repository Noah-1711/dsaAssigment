package dsaassignment;

public class Binarysearch {

	public static void main(String[] args) {

		int[]num= {1,2,3,5,4,17};
		int start=0;
		int target=17;
		int end=num.length-1;
		 
		 while(start<=end) {
			 int mid=start+(end-start)/2;
			 
			 
			 if(target==num[mid]){
				 System.out.println("index is "+mid);
				 break;
			 }
			 else if(target<num[mid]){
				 end=mid-1;
				 if(target!=num[mid]) {
					 System.out.println(" target not found");
				 }
			 }
			 else {
				 start=mid+1;
			 } 
			 
		 }
	
		 
	}

	}


