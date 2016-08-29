import java.util.*;
import common.*;
import LC.lc_150_evaluate_reverse_polish_notation;
import LC.lc_18_4Sum;
import LC.lc_43_multiply_strings;
import LC.lc_93_restore_ip_addresses;

public class MainTest {

	public static void main(String[] args) {

		// 1. Problem definition
		// 2. Solution
		// 3. Code interface

		int[] input1 = new int[] { 1, 0, -1, 0, -2, 2 };
		int[] input2 = new int[] { 2, 1, 3 };
		int[] input3 = new int[] { 3, 1, -9, -9, 9, -4, -2, 5, 10, 6, 8, -7, -8, -7, 8, 2, 9, -1 };
		int[] input4 = new int[] { 0, -9, -6, 10, -9, -5, 10, 0, -10, -5, 6, 0, -5, -6, -6, -6, -5, 2, 2 };
		char[][] input5 = new char[][]{
			{ 'A', 'B', 'C', 'D' }, 
			{ 'E', 'F', 'G', 'H' }, 
			{ 'I', 'J', 'K', 'L' }};

		System.out.println(input5.length);	
		System.out.println(input5[0].length);
		System.out.println(input5[1][2]);

		lc_43_multiply_strings sol = new lc_43_multiply_strings();
		String r1 = sol.sum("999", "1999");
		String r2 = sol.sum_v2("999", "1999");
		System.out.println(r1);
		System.out.println(r2);

		System.out.println("DONE");

	}

}
