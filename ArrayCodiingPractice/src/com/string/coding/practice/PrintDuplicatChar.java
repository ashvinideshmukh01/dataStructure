package com.string.coding.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDuplicatChar {

	public static void printDuplicateChar(String s) {
		HashSet<Character> set = new  HashSet<>();
		HashMap<Character, Integer> map = new HashMap<>();
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			//boolean add = set.add(c);
			//Integer add = map.put(c, 1);
			
				map.put(c, (map.get(c))+1);
			
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		printDuplicateChar("RajveeerRanjit");
	}

}
