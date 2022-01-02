package dsaassignment;
import java.util.Scanner;

public class ReverseNumberRecursion {
	    static void reverse(int number) {
	       if (number < 10) {
		   System.out.println(number);
		   return;
	       }
	       else {
	           System.out.print(number % 10);
	           //Method is calling itself: recursion
	           reverse(number/10);
	       }
	   }
	   public static void main(String args[])
	   {
		int num=0;
		System.out.println("Enter Number ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		System.out.print("Reverse of the input number is:");
		reverse(num);
		System.out.println();
	   }

}
