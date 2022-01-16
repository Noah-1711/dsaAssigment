package dsaassignment;
import java.util.*;

public class KthLevelBinaryTree {
	static class Node{
		int key;
		Node left,right;
		Node(int key){
			this.key=key;
			left=right=null;
		}
	}
static void PrintKthOrder(Node root,int level) {
	if(root==null) return;
	if(level==0)
		System.out.print(root.key+" ");
	PrintKthOrder(root.left,level-1);
	PrintKthOrder(root.right,level-1);
	
}
	public static void main(String[] args) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.right=new Node(6);
		PrintKthOrder(root,2);
	}

}
