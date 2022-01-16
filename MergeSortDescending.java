package dsaassignment;
import java.util.Arrays;

public class MergeSortDescending {
	 void merge(char a[], int start, int mid, int end){ 


	        int i, j, k;  
	        int n1 = mid - start + 1;    
	        int n2 = end - mid;    

	        /* temporary Arrays */  
	        int LeftArray[] = new int[n1];  
	        int RightArray[] = new int[n2];  

	      /* copy data to temp arrays */  
	     for (i = 0; i < n1; i++)    
	     LeftArray[i] = a[start + i];    
	     for (j = 0; j < n2; j++)    
	     RightArray[j] = a[mid + 1 + j];    

	    i = 0; //initial index of first sub-array  
	    j = 0; //initial index of second sub-array   
	    k = start;//initial index of merged sub-array  

	    while (i < n1 && j < n2){


	        if(LeftArray[i] <= RightArray[j]){    
	            a[k] = (char) LeftArray[i];    
	            i++;    
	        }else{    
	            a[k] = (char) RightArray[j];    
	            j++;    
	        }    
	        k++;    
	    } 

	    while (i<n1){    
	        a[k] = (char) LeftArray[i];    
	        i++;    
	        k++;    
	    }    


	    while (j<n2){    
	        a[k] = (char) RightArray[j];    
	        j++;    
	        k++;    
	    }    
	}    

	    void mergeSort(char a[], int start, int end){


	    if (start < end){  
	        int mid = (start + end) / 2;  
	        mergeSort(a, start, mid);  
	        mergeSort(a, mid + 1, end);  
	        merge(a, start, mid, end);  
	    }  
	}  

	/* Function to print the array */  
	    void printArray(char a[], int n){


	    int i;  
	    for (i = 0; i < n; i++) { 
	        System.out.print(a[i] + " ");}
	} 


	    public static void main(String[] args) {

	        char[] array = {'a','x','y','b','A','T','t'};
	        int leng = array.length;  
	        MergeSortDescending m = new MergeSortDescending();  
	        System.out.println("\nBefore sorting array elements are - ");  
	        m.printArray(array, leng);  
	        m.mergeSort(array, 0, leng - 1);  
	        System.out.println("\nAfter sorting array elements are - ");  
	        m.printArray(array, leng);  
	        System.out.println("");  


	    }
}
