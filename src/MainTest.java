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
		int[] input4 = new int[] { 1, 2 };
		int[] input5 = new int[] { 1, 2, 3, 4, 5 };
		int[][] input6 = new int[][]{{1}};
		
		lc_54_spiral_matrix sol = new lc_54_spiral_matrix();
		List<Integer> r = sol.spiralOrder(input6);
		Print.printListInteger(r);

		System.out.println("DONE");

	}

}
