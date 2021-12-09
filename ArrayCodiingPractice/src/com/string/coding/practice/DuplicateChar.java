package com.string.coding.practice;

public class DuplicateChar {

	public static void main(String[] args) {
		String s = "Rjveer";
		findDuplcate(s);
	}

	private static void findDuplcate(String s) {
		char[] charArray = s.toCharArray();
		for(int i=0;i<=charArray.length-1;i++) {
			
			for(int j=i+1;j<=charArray.length-1;j++) {
				if(charArray[i]==charArray[j]) {
					
					System.out.println(charArray[i]);
				}
			}
		}
	}

}
