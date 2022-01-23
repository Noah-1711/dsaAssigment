package dsaassignment;
import java.util.*;
import java.util.LinkedList;

public class AveragesOfBinaryTree {
	static class Node {  
	    int val;  
	    Node left, right;  
	} 
	  
	
	static void averageOfLevels(Node root)  
	{  
	    
	    Queue<Node> q = new LinkedList<Node> ();  
	    q.add(root);  
	    int sum = 0, count  = 0; 
	  
	    while (!q.isEmpty()) {  
	        sum = 0; 
	        count = 0;  
	        Queue<Node> temp = new LinkedList<Node> ();  
	        while (!q.isEmpty()) {  
	            Node n = q.peek();  
	            q.remove();  
	            sum += n.val;  
	            count++;  
	            if (n.left != null)  
	                temp.add(n.left);  
	            if (n.right != null)  
	                temp.add(n.right);  
	        }  
	        q = temp;  
	        System.out.print((sum * 1.0 / count) + " ");  
	    }  
	}  
	  
	static Node newNode(int data)  
	{  
	    Node temp = new Node();  
	    temp.val = data;  
	    temp.left = null; 
	    temp.right = null;  
	    return temp;  
	}  
	  
	public static void main(String[] args)  
	{  
	  
	  
	    Node root = null;  
	    root = newNode(4);  
	    root.left = newNode(2);  
	    root.right = newNode(9);  
	    root.left.left = newNode(3);  
	    root.left.right = newNode(5);  
	    root.right.right = newNode(7);  
	    System.out.println("Averages of levels : "); 
	    System.out.print("["); 
	    averageOfLevels(root); 
	    System.out.println("]"); 
	} 
}
