package common;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}
	
	public static ListNode create(int[] nums){
		ListNode d = new ListNode(0);
		ListNode p = d;
		for(int x : nums){
			p.next = new ListNode(x);
			p = p.next;
		}
		return d.next;
	}
}
