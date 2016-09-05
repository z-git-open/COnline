package LC;

import java.util.Arrays;

/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

Subscribe to see which companies asked this question
https://leetcode.com/problems/reverse-string/
*/

// Idea: two pointers starting from each end, moving in opposite directions


public class _344_Reverse_String {

	public String reverseString(String s) {
		// special
		if (s == null || s.length() == 0)
			return s;

		// general flow
		char[] sarray = s.toCharArray();
		int start = 0;
		int end = sarray.length;
		while (start < end) {
			char tmp = sarray[start];
			sarray[start] = sarray[end];
			sarray[end] = tmp;
			start++;
			end--;
		}
		return new String(sarray);
	}

}
