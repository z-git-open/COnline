package LC;

import java.util.*;

public class _91_Decode_Ways {

	public List<List<String>> numDecodings(String s) {
		numHelper(s.toCharArray(), 0, s.length() - 1, new ArrayList<String>());
		return decodings;
	}

	List<List<String>> decodings = new ArrayList<List<String>>();
	
	void numHelper(char[] s, int start, int end, List<String> result) {
		// special
		if (start > end)
		return;
		
		if(start == end){
			result.add(""+s[start]);
			decodings.add(new ArrayList<String>(result));
			return;
		}
		
		if(s.length == getTotalLength(result)){
			decodings.add(new ArrayList<String>(result));
			return;
		}
		
		// general flow
		result.add("" + s[start]);
		numHelper(s, start + 1, end, result);
		result.remove(result.size() - 1);
		
		String next = "" + s[start] + s[start+1];

		result.add(next);
		numHelper(s, start + 2, end, result);
		result.remove(result.size() - 1);
	}
	
	int getTotalLength(List<String> result){
		int size = 0;
		for(String s : result)
			size += s.length();
		return size;
	}
}
