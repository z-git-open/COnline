package Loop;

/*283. Move Zeroes

Total Accepted: 113221
Total Submissions: 245801
Difficulty: Easy

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

Subscribe to see which companies asked this question

https://leetcode.com/problems/move-zeroes/
*/

public class _283_Move_Zeroes {

	public void moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0)
			return;

		int copyIdx = 0;
		for (int x : nums) {
			if (x != 0)
				nums[copyIdx++] = x;
		}
		for (int i = copyIdx; i < nums.length; i++)
			nums[i] = 0;
	}
	
	
/*
    
    same idea but worse code: 
    
    public void moveZeroes2(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        //general flow
        int length = nums.length;
        int nonzeroIdx = 0;
        int copyIdx = 0;
        for(; copyIdx < length; copyIdx++){
            while(nonzeroIdx < length && nums[nonzeroIdx] == 0) nonzeroIdx++;
            if(nonzeroIdx < length){
                nums[copyIdx] = nums[nonzeroIdx++];
            }
            else
                break;
        }
        for(; copyIdx < length; copyIdx++)
            nums[copyIdx] = 0;
    }
    
    */

}
