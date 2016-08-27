package LC;

import java.util.*;

public class lc_18_4Sum {

	// ::::::::::::::::::::::::::::::::
	// ::::::::: combinations ::::::::
	// ::::::::::::::::::::::::::::::::
	public HashSet<List<Integer>> combination(int[] nums) {
		if (nums == null || nums.length == 0)
			return combinations;
		combinationHelper(nums, new HashSet<Integer>(), new ArrayList<Integer>());
		return combinations;
	}

	HashSet<List<Integer>> combinations = new HashSet<List<Integer>>();

	void combinationHelper(int[] nums, HashSet<Integer> visitedIndex, List<Integer> result) {

		if (result.size() == 4){
			combinations.add(new ArrayList<Integer>(result));
			return;
		}

		// general work flow
		int min = Integer.MIN_VALUE;
		if(result.size() != 0) min = result.get(result.size()-1);
		for (int i = 0; i < nums.length; i++) {
			if (visitedIndex.contains(i))
				continue;
			if(nums[i] < min) continue;
			result.add(nums[i]);
			visitedIndex.add(i);

			// call into sub routine
			combinationHelper(nums, visitedIndex, result);

			result.remove(result.size() - 1);
			visitedIndex.remove(i);
		}
	}

	// :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		// special case & boundary check
		if (nums == null || nums.length == 0)
			return result;

		// general work flow
		HashSet<List<Integer>> combs = combination(nums);

		for (List<Integer> c : combs) {
			//List<Integer> oneResult = fourSumHelper(c, target);
			//result.add(oneResult);
			if(c.get(0)+c.get(1)+c.get(2)+c.get(3) == target)
				result.add(c);
		}
		return result;
	}

	List<Integer> fourSumHelper(List<Integer> nums, int target) {

		List<Integer> result = new ArrayList<Integer>();
		int left = 0;
		int right = nums.size() - 1;

		int sum = 0;
		for (int x : nums)
			sum += x;

		while (left <= right) {
			if (sum < target) {
				sum -= nums.get(left++);
			} else if (sum > target) {
				sum -= nums.get(right--);
			} else {
				if (right - left == 3) {
					result = new ArrayList<Integer>(nums.subList(left, right + 1));
					break;
				} else {
					left++;
					right--;
				}
			}

		}
		return result;
	}

}
