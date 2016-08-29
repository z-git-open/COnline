import java.util.*;
import common.*;
import LC.lc_150_evaluate_reverse_polish_notation;
import LC.lc_18_4Sum;
import LC.lc_43_multiply_strings;
import LC.lc_61_rotate_list;
import LC.lc_93_restore_ip_addresses;

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
		ListNode head = ListNode.create(input4);

		lc_61_rotate_list sol = new lc_61_rotate_list();
		head = sol.rotateRight(head, 3);

		Print.printLinkedList(head);

		System.out.println("DONE");

	}

}
