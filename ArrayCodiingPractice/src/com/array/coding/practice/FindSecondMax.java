package com.array.coding.practice;

public class FindSecondMax {

	public static int findSecondMax(int array[]) {
		int max = 0;
		int secondMax = 0;
if(array.length>=1) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				secondMax = max;
				max = array[i];
			} else if (array[i] > secondMax) {
				secondMax = array[i];
			}
		}
		return secondMax;

	}
return -1;
	}
	public static void main(String[] args) {
		int[] array = {};
		int findSecondMax = findSecondMax(array);
		System.out.println(findSecondMax);
	}

}
