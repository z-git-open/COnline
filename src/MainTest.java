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
		int[] input4 = new int[] { 1, 3, 5 };
		int[] input5 = new int[] { 3, 30, 34, 5, 9 };
		int[][] input6 = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		List<String> inputa = Arrays.asList("lest", "leet", "lose", "code", "lode", "robe", "lost");
		char[][] input7 = new char[][] { { 'O' } };

		ArrayList<Integer> mylist = new ArrayList<Integer>(200);
		mylist.set(22, 77);

		

		System.out.println("DONE");

	}

	public static int myAtoi(String str) {
        //special
        if(str == null || str.length() == 0)
            return 0;
            
        //general
        str = getValidFormat(str);
        
        // "", or "123", or "+123", or "-123"
        if(str.length() == 0) return 0; 
        
        int sign = 1; 
        int idx = 0;
        if(str.charAt(0) == '+') idx++;
        if(str.charAt(0) == '-') { idx++; sign = -1;}
        
        long result = 0;
        for(; idx < str.length();idx++){
            char c = str.charAt(idx);
            result = result*10 + c - '0';
            if(sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }
        result = sign * result;
        return (int)result;
    }
    
    static String getValidFormat(String str){
        int i = 0;
        while(i < str.length() && str.charAt(i) == ' ') i++;
        if(i >= str.length()) return "";
        str = str.substring(i);
        
        boolean signParsed = false;
        i = 0;
        for(; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '+' || c == '-'){
                if(signParsed) return "";
                else signParsed = true; 
            }
            if(('0' <= c && c <= '9') == false) break;
        }
        return str.substring(0, i);
    }

}
