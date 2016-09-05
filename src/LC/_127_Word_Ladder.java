package LC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _127_Word_Ladder {
	public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
		/*wordList.remove(beginWord);
		wordList.remove(endWord);*/
		transformHelper(beginWord, endWord, wordList, 0);
		//System.out.println(result);
		if (min == Integer.MAX_VALUE)
			return 0;
		else
			return min + 1;
	}
	
	int min = Integer.MAX_VALUE;
	String result = "";
	/*
	List<String> inputa = Arrays.asList("lest", "leet", "lose", "code", "lode", "robe", "lost");
	
	lc_127_Word_Ladder sol = new lc_127_Word_Ladder();
	int r = sol.ladderLength("leet", "code", new HashSet<String>(inputa));
	*/
	
	
	
	void transformHelper(String begin, String end, Set<String> dict, int previousSteps) {
		if (isOneLetterDiff(begin, end)) {
			min = Math.min(min, previousSteps+1);
			return;
		}
		
		List<String> candidates = new ArrayList<String>();
		for (String s : dict) {
			if(isOneLetterDiff(begin, s)){
				candidates.add(s);
			}
		}
		for(String s : candidates){
			dict.remove(s);
			transformHelper(s, end, dict, previousSteps+1);
			dict.add(s);
		}
	}
	
	
	
	
	
	/*void transformHelper(String x, String y, List<String> dict, int[] visited, int previousSteps, String prev) {
		if (isOneLetterDiff(x, y)) {
			min = Math.min(min, previousSteps+1);
			result = prev + "," + y;
			return;
		}
		
		for(int i = 0; i < dict.size(); i++){
			if(visited[i] == 0 && isOneLetterDiff(x, dict.get(i))){
				visited[i] = 1;
				transformHelper(dict.get(i), y, dict, visited, previousSteps + 1, prev + ","+dict.get(i));
				visited[i] = 0;
			}
		}
	}*/
	

	boolean isOneLetterDiff(String a, String b) {
		if (a.length() != b.length())
			return false;
		int diffCount = 0;
		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) != b.charAt(i))
				diffCount++;
		}
		return diffCount == 1;
	}
	
}
