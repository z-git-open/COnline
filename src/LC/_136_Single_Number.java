package LC;

/*Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Subscribe to see which companies asked this question

https://leetcode.com/problems/single-number/

idea:
	bitwise operation
	based on 2 facts: 
	1. n ^ 0 = n
	2. n ^ n = 0
	
	since all nums appear twice (except for one), so we initialize result = 0,
	then xor all numbers, all duplicates will be gone.
	only the single one left.
*/
public class _136_Single_Number {
	public int singleNumber(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int result = 0;
		for (int x : nums) {
			result = result ^ x;
		}
		return result;
	}
}
