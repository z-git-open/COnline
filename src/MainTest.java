import java.util.*;
import common.*;
import LC.lc_150_evaluate_reverse_polish_notation;
import LC.lc_18_4Sum;
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
		String[] input5 = new String[] {"5", "-3", "/"};
		

		lc_93_restore_ip_addresses sol = new lc_93_restore_ip_addresses();
		List<String> r = sol.restoreIpAddresses("25525511135");
		Print.printListString(r);

		System.out.println("DONE");

	}

}
