package LC;

import common.ListNode;
import common.Print;

/*
	https://leetcode.com/problems/rotate-list/
	
	Given a list, rotate the list to the right by k places, where k is non-negative.
	
	For example:
 	Given 1->2->3->4->5->NULL and k = 2,
 	return 4->5->1->2->3->NULL.
 	
 	Idea:
 	1. reverse entire list
 	2. find kth node, then seperate list into 2 lists: 1...k, k+1...n
 	3. reverse both lists again
 	
 */


/*
	Another better solution:
	find the tail of the list, connect the tail to the head to make it a circle
	from the head, travel n - k - 1 steps, then the next one is the new head.
	linK: https://discuss.leetcode.com/topic/14470/my-clean-c-code-quite-standard-find-tail-and-reconnect-the-list
	 
 */
public class _61_rotate_list {
	
	public ListNode rotateRight(ListNode head, int k) {
		// special
		if (head == null || head.next == null || k <= 0)
			return head;
		
		// general work flow
		int length = 1;
		ListNode p = head;
		while(p.next != null){
			p = p.next;
			length++;
		}
		
		k = k % length ;
		if(k == 0) return head;
			
		// p is now the tail
		// make a circle
		p.next = head;
		
		//reset p to head
		p = head;
		int count = 0;
		while(count != length - k -1){
			p = p.next;
			count++;
		}
		ListNode newhead = p.next;
		p.next = null;
		return newhead;
	}
	
	
	public ListNode rotateRight2(ListNode head, int k) {
		// special
		if (head == null || head.next == null || k <= 0)
			return head;
		
		// general work flow
		int length = getLength(head);
		k = k % length;
		if(k == 0) return head;
		
		head = reverse(head);

		ListNode p = head;
		int count = 0;
		while (count <= k) {
			p = p.next;
			count++;
		}
		
		ListNode head2 = p.next;
		p.next = null;

		ListNode tail1 = head;
		head = reverse(head);
		head2 = reverse(head2);
		tail1.next = head2;
		return head;
	}

	int getLength(ListNode head) {
		int length = 0;
		ListNode p = head;
		while (p != null) {
			length++;
			p = p.next;
		}
		return length;
	}

	ListNode reverse(ListNode head) {
		// special
		if (head == null || head.next == null)
			return head;

		// general work flow
		ListNode previous = null;
		ListNode current = head;
		while (current != null) {
			ListNode next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

}
