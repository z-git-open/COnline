package Math;
/*258. Add Digits
Please login first. 
Question Editorial Solution 
My Submissions 
	• Total Accepted: 110782
	• Total Submissions: 224860
	• Difficulty: Easy
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit. 
For example: 
Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it. 
Follow up:
Could you do it without any loop/recursion in O(1) runtime? 
Hint:
	1. A naive implementation of the above process is trivial. Could you come up with other methods? 
	2. What are all the possible results?
	3. How do they occur, periodically or randomly?
	4. You may find this Wikipedia article useful.

From <https://leetcode.com/problems/add-digits/> 

Solution: 
https://discuss.leetcode.com/topic/41017/simple-java-solution-no-recursion-loop

*/
public class _258_Add_Digits {
	public int addDigits(int num) {
		if (num == 0) {
			return 0;
		}
		if (num % 9 == 0) {
			return 9;
		} else {
			return num % 9;
		}
	}
}
