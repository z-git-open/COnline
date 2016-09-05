package List;

import common.ListNode;

/*237. Delete Node in a Linked List

Total Accepted: 103390
Total Submissions: 231782
Difficulty: Easy

Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.

Subscribe to see which companies asked this question
https://leetcode.com/problems/delete-node-in-a-linked-list/
*/

/* Idea: since we do not know the parent node, so we cannot really remove that node from the list.
copy the value of next node to this node, then make this node referencing next's next.

*/

public class _237_Delete_Node_in_a_Linked_List {
	public void deleteNode(ListNode node) {
		if (node == null || node.next == null)
			return;
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
