package com.array.coding.practice;

import java.util.Iterator;

public class ArrayOFProdOfAllExceptItself {

	public static void main(String[] args) {
		
		int [] array = {1,3,8,5,4};
		int product =1;
		int [] newArray = new int[array.length];
		for(int i=0;i<array.length;i++) {
			newArray[i] = product;
			product=product*array[i];
		}
		product=1;
		for(int i =array.length-1;i>=0;i--) {
			newArray[i]=newArray[i]*product;
			product=product*array[i];
		}
		for (int i : newArray) {
			System.out.println(i);
		}
		
	}

}
