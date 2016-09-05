package Set;

/*https://leetcode.com/problems/ransom-note/

	383. Ransom Note

 Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,  write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;  otherwise,  it  will  return  false.   

Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true

idea: as we only have lower case letters, so we don't need hash table
*/
public class _383_Ransom_note {
	public boolean canConstruct(String ransomNote, String magazine) {
		// special
		if (ransomNote == null || magazine == null)
			return false;
		if (ransomNote.length() == 0 && magazine.length() == 0)
			return true;

		int[] map = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			int idx = magazine.charAt(i) - 'a';
			map[idx]++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			int idx = ransomNote.charAt(i) - 'a';
			map[idx]--;
			if (map[idx] < 0)
				return false;
		}
		return true;
	}
}
