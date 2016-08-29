package LC;

public class lc_2_add_two_numbers {

	/*
	 * 
	 * Have 2 pointers to walk through both list in a while loop, the check
	 * condition is that as long as there is at least one pointer not equal to
	 * null then we go into the loop Inside the loop, we have if-else to check
	 * if a pointer is referencing to null, if the pointer referencing to null,
	 * then we use 0 as its value.
	 * 
	 * finally, don't forget to check carryforward value, if it's non zeor we
	 * need to add one more ListNode.
	 */

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// special & boundary check
		if (l1 == null && l2 == null)
			return null;
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		// general work flow
		int val1 = 0;
		int val2 = 0;
		int carryforward = 0;
		ListNode head = new ListNode(0);
		ListNode p = head;
		while (l1 != null || l2 != null) {
			if (l1 == null)
				val1 = 0;
			if (l2 == null)
				val2 = 0;
			int sum = (val1 + val2 + carryforward);
			p.next = new ListNode(sum % 10);
			p = p.next;
			carryforward = sum / 10;
		}

		// important to check carryforward is still non zero
		if (carryforward != 0)
			p.next = new ListNode(carryforward);
		return head.next;
	}

}
