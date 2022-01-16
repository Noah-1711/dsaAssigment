package dsaassignment;
import java.util.*;
import java.util.LinkedList;

public class RightViewBinaryTree {
	// Binary tree node
    static class Node  //Inner Class
    {
        int data;
        Node left,right;
        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // function to print right view of binary tree
    static void rightView(Node root)
    {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root); //we add the root first.
        while (!q.isEmpty())
        {
            // number of nodes at current level
            int count = q.size();
            // Traverse all nodes of current level
            for (int i = 0; i < count; i++)
            {
                Node curr = q.poll();  //current node
                // Print the right most or last element at
                // the level
                if (i == count-1)
                    System.out.print(curr.data + " ");
                // Add left child node to queue
                if (curr.left != null)
                    q.add(curr.left);
                // Add right child node to queue
                if (curr.right != null)
                    q.add(curr.right);
            }
        }
    }
    // Driver code
    public static void main(String[] args)
    {
        // construct binary tree as shown in above diagram
        Node root = new Node(15);
        root.left = new Node(10);
        root.left.left=new Node(5);
        root.right = new Node(35);
        root.right.left = new Node(30);
        root.right.left.left = new Node(20);
        root.right.right = new Node(45);
 
        System.out.println("The Right View of the Binary Tree is: ");
        System.out.println();
 
        rightView(root);
    }

}
