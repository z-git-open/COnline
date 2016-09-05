package LC;

public class _29_Divide_Two_Integers {
	
	public int divide(int dividend, int divisor) {
		//special 
		if(divisor == 0)
			return Integer.MAX_VALUE;
		
		//general flow
		boolean negative = false;
		if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0))
			negative = true;
		long l_dividend = Math.abs((long)dividend);
		long l_divisor = Math.abs((long)divisor);
		long result = 0;
		while(l_dividend >= l_divisor){
			long x = l_divisor;
			long count = 1;
			while(l_dividend >= x){
				x = x << 1;
				count = count <<1;
			}
			result += (count >>1);
			l_dividend -= (x >> 1);
		}
		result = negative ? -result : result;
		
		if(Integer.MIN_VALUE <= result && result <= Integer.MAX_VALUE)
			return (int)result;
		else
			return Integer.MAX_VALUE;
	}

}
