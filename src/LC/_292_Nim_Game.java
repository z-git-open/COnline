package LC;

import java.util.HashMap;

public class _292_Nim_Game {
	public boolean canWinNim(int n) {
		int player = 1;
		 int winner = winNimHelper(n, player);
		return player == winner;
	}
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	int winNimHelper(int stones, int player) {
		// special
		if (stones <= 3)
			return player;
		String key = stones + "," + player;
		if(map.containsKey(key)) return map.get(key);
		
		// general flow
		int winner = winNimHelper(stones -1, -player);
		map.put(getKey(stones-1, -player), winner);
		if(player == winner) return player;
		
		winner = winNimHelper(stones - 2, -player);
		map.put(getKey(stones-2, -player), winner);
		if(player == winner) return player;
		
		winner = winNimHelper(stones - 3, -player);
		map.put(getKey(stones-3, -player), winner);
		if(player == winner) return player;
		
		map.put(getKey(stones, player), -player);
		return -player;
	}
	
	String getKey(int stones, int player){
		return stones + "," + player;
	}
}
