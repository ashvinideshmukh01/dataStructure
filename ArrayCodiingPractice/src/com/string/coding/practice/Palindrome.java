package com.string.coding.practice;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		chkPalindrome("ST");
	}

	private static void chkPalindrome(String s) {
		String reverse = "";
		if(s.isEmpty()) {
			System.out.println("String is empty!!");
			return;
		}
		char[] charArray = s.toCharArray();
//		for(int i=charArray.length-1;i>=0;i--){
//			reverse=reverse+charArray[i];
//		}
		char temp;
		for(int i=0,j=charArray.length-1;i<j;i++,j--) {
			temp=charArray[j];
			charArray[j]=charArray[i];
			charArray[i]=temp;
		}
		System.out.println(new String(charArray));
		if(s.equals(new String(charArray))){
			System.out.println("String is palindrome!!!");
		}else {
			System.out.println("String is not Palindrome!!");
		}
	}

}
