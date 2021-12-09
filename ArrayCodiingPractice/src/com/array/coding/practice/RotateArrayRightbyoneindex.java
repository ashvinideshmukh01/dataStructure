package com.array.coding.practice;

import java.util.Arrays;

public class RotateArrayRightbyoneindex {

	public static void main(String[] args) {
		//int array [] = {1,2,3,4,5};
		int array [] = {};
		//System.out.println(array.length);
		if(array.length != 0) {
		int last = array[array.length-1];
		for(int i = array.length-1;i>=1;i--) {
			array[i] = array[i-1];
		}
		array[0] = last;
		System.out.println(Arrays.toString(array));
	}else {
		System.out.println("Array is empty!!!");
	}
	}
}
