package LC;

/*
 * https://leetcode.com/problems/contains-duplicate-iii/
 * 
 * 
 * 
 * 
 * 
 */

public class lc_220_Contains_Duplicate_III {

	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		// special
		if (nums == null || nums.length <= 1)
			return false;

		// general work flow
		int length = nums.length;
		for (int i = 0; i < length - 1; i++) {
			if (containDupHelper(nums, i, i + k, t))
				return true;
		}
		return false;
	}

	boolean containDupHelper(int[] nums, int start, int end, int maxDiff) {
		int length = nums.length;
		if (end >= length)
			end = length - 1;
		if (nums[end] - nums[start] <= maxDiff)
			return true;
		else {
			if (nums[start + 1] - nums[start] > maxDiff)
				return false;
			else
				return true;
		}
	}

}
