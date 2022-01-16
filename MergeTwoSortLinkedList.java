package dsaassignment;



class ListNode {
	  int val;
	  ListNode next;
	  ListNode(int val) {
	    this.val = val;
	  }
	}

public class MergeTwoSortLinkedList {
	private static ListNode mergeSortedLinkedLists(ListNode l1, ListNode l2) {
	    ListNode result = null;
	    ListNode head = null;
	    
	    while(l1 != null || l2 != null) {
	      int minVal;
	      if (l1 == null) {
	        minVal = l2.val;
	        l2 = l2.next;
	      } else if (l2 == null) {
	        minVal = l1.val;
	        l1 = l1.next;
	      } else if(l1.val <= l2.val) {
	        minVal = l1.val;
	        l1 = l1.next;
	      } else {
	        minVal = l2.val;
	        l2 = l2.next;
	      }

	      if(result == null) {
	        result = head = new ListNode(minVal);
	      } else {
	        result.next = new ListNode(minVal);
	        result = result.next;
	      }
	    }

	    return head;
	  }

	  public static void main(String[] args) {
	    ListNode l1 = new ListNode(1);
	    l1.next = new ListNode(2);
	    l1.next.next = new ListNode(4);
	    l1.next.next.next = new ListNode(6);

	   

	    ListNode l2 = new ListNode(1);
	    l2.next = new ListNode(3);
	    l2.next.next = new ListNode(4);
	    l2.next.next.next = new ListNode(5);

	    ListNode mergedList = mergeSortedLinkedLists(l1, l2);
	    while(mergedList != null) {
	      System.out.print(mergedList.val + " ");
	      mergedList = mergedList.next;
	    }
	    System.out.println();
	  }
}
