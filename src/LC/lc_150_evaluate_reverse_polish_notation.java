package LC;

import java.util.*;

public class lc_150_evaluate_reverse_polish_notation {

	public int evalRPN(String[] tokens) {
		// special case & boundary check
		if (tokens == null || tokens.length == 0)
			return 0;
		// general work flow
		Stack<Integer> stack = new Stack<Integer>();
		for (String s : tokens) {
			if (isValidNum(s)) {
				stack.push(Integer.parseInt(s));
			} else {
				int second = stack.pop();
				int first = stack.pop();
				if (s.equals("+")) {
					stack.push(first + second);
				} else if (s.equals("-")) {
					stack.push(first - second);
				} else if (s.equals("*")) {
					stack.push(first * second);
				} else if (s.equals("/")) {
					stack.push(first / second);
				}
			}
		}
		return stack.pop();
	}

	boolean isValidNum(String s) {
		try {
			int r = Integer.parseInt(s);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
