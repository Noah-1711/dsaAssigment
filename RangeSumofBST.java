package dsaassignment;
import java.util.Queue;
import java.util.LinkedList;

public class RangeSumofBST {
	static class Node
	{
	    int val;
	    Node left, right;
	};
	 
	static Node newNode(int item)
	{
	    Node temp = new Node();
	    temp.val = item;
	    temp.left = temp.right = null;
	 
	    return temp;
	}
	 
	
	static int sum = 0;
	 
	
	static int rangeSumBST(Node root, int low,
	                                  int high)
	{
	     
	    // Base Case
	    if (root == null)
	    return 0;
	 
	    
	    Queue<Node> q = new LinkedList<Node>();
	 
	   
	    q.add(root);
	 
	    while (q.isEmpty() == false)
	    {
	         
	        
	        Node curr = q.peek();
	        q.remove();
	 
	     
	        if (curr.val >= low &&
	            curr.val <= high)
	        {
	             
	            // Add it to sum
	            sum += curr.val;
	        }
	 
	       
	        if (curr.left != null &&
	            curr.val > low)
	 
	            // Insert into queue
	            q.add(curr.left);
	 
	        
	        if (curr.right != null &&
	            curr.val < high)
	 
	            // Insert into queue
	            q.add(curr.right);
	    }
	 
	    // Return the resultant sum
	    return sum;
	}
	 
	// Function to insert a new node
	// into the Binary Search Tree
	static Node insert(Node node, int data)
	{
	     
	    // Base Case
	    if (node == null)
	        return newNode(data);
	 
	    // If the data is less than the
	    // value of the current node
	    if (data <= node.val)
	 
	        // Recur for left subtree
	        node.left = insert(node.left,
	                           data);
	 
	    // Otherwise
	    else
	 
	        // Recur for the right subtree
	        node.right = insert(node.right,
	                            data);
	 
	    // Return the node
	    return node;
	}
	 
	
	public static void main(String[] args)
	{
	     
	    Node root = null;
	    root = insert(root, 10);
	    insert(root, 5);
	    insert(root, 15);
	    insert(root, 3);
	    insert(root, 7);
	    insert(root, 18);
	 
	    int L = 7, R = 18;
	    System.out.print(rangeSumBST(root, L, R));
	}
	}
	 

