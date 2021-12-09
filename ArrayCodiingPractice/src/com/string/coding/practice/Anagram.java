package com.string.coding.practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1="Rajveer";
		String s2="ajveerR";
		
		String case1 = s1.toLowerCase();
		String case2 = s2.toLowerCase();
		
		char[] charArray1 = case1.toCharArray();
		char[] charArray2 = case2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		boolean equals = Arrays.equals(charArray1, charArray2);
		System.out.println(equals);
		
	}

}
