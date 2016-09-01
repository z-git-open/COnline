package LC;

import java.util.Arrays;

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
		if (nums == null || nums.length <= 1 || k == 0)
			return false;

		// general work flow
		int length = nums.length;
		int min_idx = 0;
		int max_idx = 0;
		int start_idx = 0;
		for(int i = 0; i < length; i++){
			
			min_idx = (nums[i] <= nums[min_idx]) ? i : min_idx;
			max_idx = (nums[i] >= nums[max_idx]) ? i : max_idx;
			if(i != min_idx && Math.abs(nums[i] - nums[min_idx]) <= t) return true;
			if(i != max_idx && Math.abs(nums[i] - nums[max_idx]) <= t) return true;
			if(i - start_idx == k+1){
				
				if(start_idx == min_idx)
					min_idx = findMinIndex(nums, start_idx+1, i);
				if(start_idx == max_idx)
					max_idx = findMaxIndex(nums, start_idx+1, i);
				start_idx ++;
			}
		}
		
		return false;
	}
	
	int findMinIndex(int[] nums, int start, int end){
		int minidx = start;
		for(int i = start+1; i <= end; i++)
			minidx = (nums[i] <= nums[minidx])? i : minidx;
		return minidx;
	}
	
	int findMaxIndex(int[] nums, int start, int end){
		int maxidx = start;
		for(int i = start+1; i <= end; i++)
			maxidx = (nums[i] >= nums[maxidx])? i : maxidx;
		return maxidx;
	}

	
}
