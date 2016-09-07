package LC;

import java.util.ArrayList;
import java.util.List;

/*
202. Happy Number  QuestionEditorial Solution  My Submissions

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

https://leetcode.com/problems/happy-number/


The most important observation:
1. if x is happy num, then we will hit 1
2. if x in unhappy num, then we will hit 4 in the endless loop

so using recursion but check 1 and 4 as special cases.
*/

public class _202_Happy_Number {
	public boolean isHappy(int n) {
		// special
		if (n == 1)
			return true;
		if (n == 0 || n == 4)
			return false;

		// general flow
		int result = 0;
		List<Integer> digits = getDigits(n);
		for (int x : digits) {
			result += x * x;
		}
		return isHappy(result);
	}

	List<Integer> getDigits(int n) {
		List<Integer> result = new ArrayList<Integer>();
		while (n != 0) {
			result.add(n % 10);
			n = n / 10;
		}
		return result;
	}
}
