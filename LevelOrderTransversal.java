package dsaassignment;
import java.util.*;
import java.util.LinkedList;

public class LevelOrderTransversal {
	static class Node{
		int key;
		Node left,right;
	    Node(int key){
	    	this.key=key;
	    	left=right=null;
	    }
	}
	static int hightofTree(Node root) {
		if(root==null) return -1;
		else{ 
			int lhight=hightofTree(root.left);
			int rhight=hightofTree(root.right);
			if(lhight>rhight) return (lhight+1);
			else return (rhight+1);
		}
	}
	static void printkthLevel(Node root, int level) {
		if(root==null) return;
		if(level==0) System.out.print(root.key+" ");
		printkthLevel(root.left,level-1);
		printkthLevel(root.right,level-1);
	}
	static void levelOrderTraversal(Node root) {
		int h=hightofTree(root);
		if(h==-1) return;
		for(int i=0;i<=h;i++) {
			printkthLevel(root,i);
			System.out.println();
		}
		
	}
	static void levelOrderTraversal1(Node root) {
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int k=q.size();
		 while(k>0) {
			 Node front =q.poll();
			 if(front.left!=null) q.add(front.left);
			 if(front.right!=null) q.add(front.right);
			 System.out.print(front.key+" ");
			 k--;
		 }
			System.out.println();
			}
	}
		public static void main(String[] args) {
		 Node root=new Node(1);
		    root.left=new Node(2);
			root.right=new Node(3);
			root.left.left=new Node(4);
			root.left.right=new Node(5);
			root.right.right=new Node(6);
			System.out.println(" Using Iterative: ");
			levelOrderTraversal1(root);
			System.out.println("Using Recursive: ");
			levelOrderTraversal(root);
		}

}
