package dsaassignment;
import java.util.Scanner;

public class EvenElementDecreasing {
	static public void evendecresing(int a) {

		if(a<=0) {
		return ;
		}
		if(a%2==0) {
		System.out.println(a);
		}
		evendecresing(a-1);

		}

		public static void main(String args[]) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		System.out.println("The Even elements are");

		evendecresing(n);
		}

}
