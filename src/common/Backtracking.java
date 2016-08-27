package common;

import java.util.*;

public class Backtracking {

	// ::::::::::::::::::::::::::::::::
	// ::::::::: permutation ::::::::
	// ::::::::::::::::::::::::::::::::
	public List<List<Integer>> permutation(int[] nums) {
		if (nums == null || nums.length == 0)
			return perms;
		permutationHelper(nums, new HashSet<Integer>(), new ArrayList<Integer>());
		return perms;
	}

	List<List<Integer>> perms = new ArrayList<List<Integer>>();

	void permutationHelper(int[] nums, HashSet<Integer> visitedIndex, List<Integer> result) {
		// special case
		if (nums.length == result.size()) {
			perms.add(new ArrayList<Integer>(result));
			return;
		}

		// general work flow
		for (int i = 0; i < nums.length; i++) {
			if (visitedIndex.contains(i))
				continue;
			result.add(nums[i]);
			visitedIndex.add(i);

			// call into sub routine
			permutationHelper(nums, visitedIndex, result);

			result.remove(result.size() - 1);
			visitedIndex.remove(i);
		}
	}

	// :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

	
	
	// :::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	// ::::::::: get all of combinations + permutations ::::::::
	// :::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	public List<List<Integer>> combination(int[] nums) {
		if (nums == null || nums.length == 0)
			return combinations;
		combinationHelper(nums, new HashSet<Integer>(), new ArrayList<Integer>());
		return combinations;
	}

	List<List<Integer>> combinations = new ArrayList<List<Integer>>();

	void combinationHelper(int[] nums, HashSet<Integer> visitedIndex, List<Integer> result) {

		combinations.add(new ArrayList<Integer>(result));

		// general work flow
		for (int i = 0; i < nums.length; i++) {
			if (visitedIndex.contains(i))
				continue;

			result.add(nums[i]);
			visitedIndex.add(i);

			// call into sub routine
			combinationHelper(nums, visitedIndex, result);

			result.remove(result.size() - 1);
			visitedIndex.remove(i);
		}
	}

	// :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

}
