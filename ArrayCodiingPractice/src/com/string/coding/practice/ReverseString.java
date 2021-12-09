package com.string.coding.practice;

public class ReverseString {

	public static void main(String[] args) {
		reverseString("Raj veer");
	}

	private static void reverseString(String s) {
		String reverse="";
		char[] charArray = s.toCharArray();
		for(int  i=(s.length())-1;i>=0;i--) {
			reverse=reverse+charArray[i];
		}
		System.out.println(reverse);
	}

}
