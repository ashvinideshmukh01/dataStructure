package com.array.coding.practice;

import java.util.HashMap;

public class FirstonRepatingInteger {

	public static int findFirstNonRepeating(int array[]) {
		if(array.length>=1) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<array.length;i++) {
			map.put(array[i], 0);
		}
		
		for(int i=0;i<array.length;i++) {
			map.put(array[i], map.get(array[i])+1);
		}
		
		for(int i=0;i<array.length;i++) {
			if(map.get(array[i]) <=1) {
				return array[i];
			}
		}
		
		return -1;
		
	}
		return 0;
	}
	
	public static void main(String[] args) {
		
		int[] array = {};
		int findFirstNonRepeating = findFirstNonRepeating(array );
		if(findFirstNonRepeating==-1) {
			System.out.println("Array contains all repeating elements!!");
		}else if(findFirstNonRepeating!=0) {
			System.out.println(findFirstNonRepeating);
		}else {
			System.out.println("Array is empty!!!");
		}
	}

}
