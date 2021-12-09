package com.array.coding.practice;

public class FindMin {

	public static void main(String[] args) {
		//int [] array = {1,3,8,5,4};
		//int [] array = {1};
		int [] array = {};
		
		if(array.length!=0) {
			int min = array[0];
		for(int i =1;i<array.length-1;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		
		System.out.println(min);
		}else {
			System.out.println("Array does not have elements");
		}
	}

}
