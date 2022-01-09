package dsaassignment;
import java.util.Stack;

public class RemoveAdjacentchar {
	public void removeAdjacentDuplicate(String text)
	{
		if (text.length() == 0)
		{
			return;
		}
		// Define use useful resultant variables
		String result = "";
		int element = 0;
		// Use to collect string characters
		Stack < Character > record = new Stack < Character > ();
		// Find all unique adjacent characters
		while (element < text.length())
		{
			if (record.isEmpty() || record.peek() != text.charAt(element))
			{
				// When stack is empty or
				// Two adjacent characters are not same
				record.push(text.charAt(element));
			}
			else
			{
				// Two adjacent characters are same
				// Remove stack element
				record.pop();
			}
			// visit to next character
			element++;
		}
		// Collect non adjacent duplicate characters
		while (!record.isEmpty())
		{
			result = record.peek() + result;
			record.pop();
		}
		// Display given text
		System.out.println(" Given Text : " + text);
		// Display calculated result
		System.out.println(" Remove Adjacent Duplicate : [" + result + "]");
	}
	public static void main(String[] args)
	{
		RemoveAdjacentchar  task = new RemoveAdjacentchar ();
		
		task.removeAdjacentDuplicate("Geekster");
	
	}
}
