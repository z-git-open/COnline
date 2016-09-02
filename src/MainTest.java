import java.util.*;
import common.*;
import LC.*;

public class MainTest {

	public static void main(String[] args) {

		// 1. Problem definition
		// 2. Solution
		// 3. Code interface

		int[] input1 = new int[] { 1, 0, -1, 0, -2, 2 };
		int[] input2 = new int[] { 2, 1, 3 };
		int[] input3 = new int[] { 3, 1, -9, -9, 9, -4, -2, 5, 10, 6, 8, -7, -8, -7, 8, 2, 9, -1 };
		int[] input4 = new int[] { 1, 3, 5};
		int[] input5 = new int[] { 3, 30, 34, 5, 9 };
		int[][] input6 = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		List<String> inputa = Arrays.asList("lest", "leet", "lose", "code", "lode", "robe", "lost");
		
		lc_91_Decode_Ways sol = new lc_91_Decode_Ways();
		List<List<String>> r = sol.numDecodings("1234");
		Print.printListListString(r);
		 
		
		System.out.println("DONE");

	}

}



