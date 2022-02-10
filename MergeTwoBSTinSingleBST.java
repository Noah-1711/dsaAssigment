package dsaassignment;
import java.util.ArrayList;



class MergeTwoBSTinSingleBST {
    // class representing node of a binary tree
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
        }
    }
    // function to print pre-order traversal of a binary tree
    private static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    // function to store in-order traversal of a binary tree in an array-list
    private static void storeInOrder(Node root, ArrayList<Integer> arr) {
        if (root != null) {
            storeInOrder(root.left, arr);
            arr.add(root.data);
            storeInOrder(root.right, arr);
        }
    }
    // function to merge two sorted array-lists
    private static ArrayList<Integer> mergeSortedArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                arr.add(arr1.get(i));
                i++;
            } else {
                arr.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            arr.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            arr.add(arr2.get(j));
            j++;
        }
        return arr;
    }
    // function to convert sorted array-list to balanced BST
    private static Node constructBSTFromSortedArray(ArrayList<Integer> arr, int start, int end) {
        // base case
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = constructBSTFromSortedArray(arr, start, mid - 1);
        root.right = constructBSTFromSortedArray(arr, mid + 1, end);
        return root;
    }
    private static Node mergeBST(Node root1, Node root2) {
        // store the in-order traversal of tree1 in an array
        ArrayList<Integer> arr1 = new ArrayList<>();
        storeInOrder(root1, arr1);
        // store the in-order traversal of tree2 in an array
        ArrayList<Integer> arr2 = new ArrayList<>();
        storeInOrder(root2, arr2);
        // merge the two sorted arrays
        ArrayList<Integer> arr = mergeSortedArrays(arr1, arr2);
        // construct the balanced BST from this sorted array
        return constructBSTFromSortedArray(arr, 0, arr.size() - 1);
    }
    public static void main(String[] args) {
        // Example
        Node root1 = new Node(7);
        root1.left = new Node(5);
        root1.right = new Node(8);
        root1.left.left = new Node(4);
        root1.left.right = new Node(6);
        root1.right.right = new Node(9);
        Node root2 = new Node(2);
        root2.left = new Node(1);
        root2.right = new Node(3);
        Node root = mergeBST(root1, root2);
        preOrder(root);
        System.out.println();
    }
}

	
	 
	