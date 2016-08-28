package LC;

public class lc_43_multiply_strings {

	public String multiply(String num1, String num2) {
		// special case
		if (num1 == null || num1.length() == 0 || num2 == null || num2.length() == 0)
			return "";

		// general work flow
		String result = "";
		for (int i = 0; i < num1.length(); i++) {
			String r = multiplySingleNum(num1.charAt(i) - '0', num2);
			result = (result.length() == 0) ? r : sum(result + "0", r);
		}
		return result;
	}

	public String multiplySingleNum(int x, String num) {
		String result = "";
		int carryforward = 0;
		for (int i = num.length() - 1; i >= 0; i--) {
			int y = num.charAt(i) - '0';
			int total = x * y + carryforward;
			result = total % 10 + result;
			carryforward = total / 10;
		}
		if (carryforward == 0)
			return result;
		else
			return carryforward + result;
	}

	public String sum(String x, String y) {

		int length = Math.max(x.length(), y.length());
		int xlength = x.length();
		for (int i = 1; i <= length - xlength; i++)
			x = "0" + x;
		int ylength = y.length();
		for (int i = 1; i <= length - ylength; i++)
			y = "0" + y;

		String result = "";
		int carryforward = 0;
		for (int i = length - 1; i >= 0; i--) {
			int total = x.charAt(i) - '0' + y.charAt(i) - '0' + carryforward;
			result = total % 10 + result;
			carryforward = total / 10;
		}
		if (carryforward == 0)
			return result;
		else
			return carryforward + result;
	}

}
