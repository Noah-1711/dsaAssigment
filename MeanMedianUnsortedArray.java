package dsaassignment;
import java.util.Scanner;

public class MeanMedianUnsortedArray {

		static void sort(int arr[],int size)
		{
		    int i,j,temp;
		    for(i=0;i<size;i++)
		    {
		        for(j=i+1;j<size;j++)
		        if(arr[i]>=arr[j])
		        {
		         temp=arr[i];
		         arr[i]=arr[j];
		         arr[j]=temp;
		        }}
		}
		static void Find_mean(int arr[],int size)
		{
		    int sum=0,i;
		    for(i=0;i<size;i++)
		    {
		        sum+=arr[i];
		    }
		    double mean=(double)sum/(double)size;
		    System.out.println("Mean = "+mean);
		}
		static void Find_median(int arr[],int size)
		{
		    sort(arr,size);
		    if(size%2==1)
		    {
		    double median=arr[size/2];
		    System.out.println("Median= "+median);
			}
		   else
		   {
		       double median=(arr[size/2]+(arr[(size/2)-1]))/2.0;
		       System.out.println("Median= "+median);
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			  System.out.println("Enter the size of the array:");
			     int size,i;
			     size=sc.nextInt();
			     int arr[ ]=new int[size];
			  System.out.println("Enter the Element of the array:");
			      for(i=0;i<size;i++)
			     {
			         arr[i]=sc.nextInt();
			     }
			      Find_mean(arr,size);
			      Find_median(arr,size);
		      sc.close();
		}
	

}
