package LC;

import java.util.HashSet;

public class lc_3_Longest_Substring_Without_Repeating_Characters {

	/*
	 * https://leetcode.com/articles/longest-substring-without-repeating-characters/
	 * 
	 * 
	enumerate the string, if we don't hit a duplicate char, we append that char to result.
	If we hit a duplicate, we compare current string with the previously saved longest str, and update longest str accordingly.
	then we need to find out the first index of the duplicate char in the result, chop the result string from the right position of the dup.

	here is the idea but without using hashmap
	https://discuss.leetcode.com/topic/8232/11-line-simple-java-solution-o-n-with-explanation

	*/
	
	
	public int lengthOfLongestSubstring(String s) {
		// special
		if (s == null || s.length() == 0)
			return 0;
		// general work flow
		int length = s.length();
		String longestStr = "";
		String result = "";
		for (int i = 0; i < length; i++) {
			if(result.contains(""+s.charAt(i))){
				if(result.length() > longestStr.length()){
					longestStr = new String(result);
				}
				int dupIdx = result.indexOf(""+s.charAt(i));
				result = result.substring(dupIdx+1)+s.charAt(i);
			}
			else{
				result += s.charAt(i);
			}
		}
		return (result.length() > longestStr.length()) ? result: longestStr;
	}
}
