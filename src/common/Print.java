package common;

import java.util.*;

public class Print {
	
	public static void printListListInteger(List<List<Integer>> result){
		if(result == null) return;
		for(List<Integer> list : result){
			printListInteger(list);
		}
	}
	
	public static void printListInteger(List<Integer> result){
		if(result == null) return;
		for(Integer x : result){
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static void printListString(List<String> result){
		for(String s : result){
			System.out.print(s + ", ");
		}
		System.out.println();
	}

}