package dsaassignment;
import java.util.Scanner;

public class PrintMatrix {
	 public static void main(String args[])
	 {
	 Scanner sc = new Scanner(System.in);
	 
	         int i,j,row,col;
	 
	 System.out.println("Enter the number of rows:");
	 row = sc.nextInt();
	 System.out.println("Enter the number of columns:");
	 col = sc.nextInt();
	 
	 int[][] mat = new int[row][col];
	 
	     System.out.println("Enter the elements of the matrix") ;
	     for(i=0;i<row;i++)
	     { 
	      for(j=0;j<col;j++)
	      { 
	          mat[i][j] = sc.nextInt();
	     }
	 }
	 
	     System.out.println(" matrix") ;
	     for(i=0;i<row;i++)
	     { 
	      for(j=0;j<col;j++)
	      { 
	        System.out.print(mat[i][j]+"\t");
	     }
	       System.out.println("");
	 }
	 } 

}
