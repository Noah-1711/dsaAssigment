package dsaassignment;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



class Node
{
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}

public class MaxLevelSumOfBinaryTree {
	 static ArrayList<Integer> arr = new ArrayList<Integer>();
		static int levelSoFar=0;		 

	    static void max_levelsum(Node root) {
	    	Queue<Node> q = new LinkedList<>();
			q.add(root);
			int level=1,max=Integer.MIN_VALUE,i=0;
			while(!q.isEmpty()){
				int sum =0;
				int total =0;
				Queue<Node> temp = new LinkedList<>();
				while(!q.isEmpty()){
					Node curr = q.poll();
					sum+=curr.key;
					total++;
					if(curr.left!=null) {
						temp.add(curr.left);
					}
					if(curr.right!=null) {
						temp.add(curr.right);
					}
				}
				
			    if(sum>max) {
			    	max=sum;
			    	i=level;
			    }
			    level++;
				q=temp;
			}
			System.out.println(i);
	    }
	    public static void spiralPrint(Node root){
	    	 
	        
	        Deque<Node> dq = new ArrayDeque<>();
	         
	        dq.offer(root);
	         
	        boolean reverse = true;
	 
	        while (!dq.isEmpty()){
	             int n = dq.size();
	             
	              if(!reverse){
	               
	                for (int i =0; i < n; i++){
	                    if (dq.peekFirst().left  != null)
	                        dq.offerLast(dq.peekFirst().left);
	                   
	                    if (dq.peekFirst().right != null)
	                        dq.offerLast(dq.peekFirst().right);
	                   
	                    System.out.print(dq.pollFirst().key + "  ");
	                   
	                   
	                }
	                reverse = !reverse;
	               
	            }else{
	 
	              
	                while (n-- >0){
	                    
	                    if (dq.peekLast().right != null)
	                        dq.offerFirst(dq.peekLast().right);
	                    if (dq.peekLast().left != null)
	                        dq.offerFirst(dq.peekLast().left);
	                    System.out.print(dq.pollLast().key + "  ");
	                }
	                reverse = !reverse;
	                 
	            }
	        }
	    }
	    public static void main(String[] args)
		{
			Node root1 = new Node(100);
			root1.left = new Node(65);
			root1.right = new Node(3);
			root1.left.left = new Node(4);
			root1.left.right = new Node(5);
			root1.right.right = new Node(6);
			max_levelsum(root1);
			spiralPrint(root1);
	       

		}
}
