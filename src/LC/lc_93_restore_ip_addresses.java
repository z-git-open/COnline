package LC;

import java.util.*;

public class lc_93_restore_ip_addresses {
	public List<String> restoreIpAddresses(String s) {
		restoreHelper(s.toCharArray(), 0, "", "");
		return new ArrayList<String>(combinations);
	}

	HashSet<String> combinations = new HashSet<String>();

	void restoreHelper(char[] s, int start, String result, String prefix) {
		// special
		if (s.length - 1 - start + 1 <= 3 && result.length() <= 3) {
			combinations.add(prefix + "." + result + "." + (new String(s, start, s.length - start)));
			return;
		}

		// general work flow
		int length = s.length; 
		for (int i = start; i < length; i++) {
			if (i + 2 < length && s[i] == '2' && s[i + 1] == '5' && s[i + 2] == '5') {
				i = i + 2;
				prefix += (prefix.length() == 0) ? "255" : ".255";
				continue;
			}
			result += s[i];
			restoreHelper(s, i + 1, result, prefix);
		}
	}

}
