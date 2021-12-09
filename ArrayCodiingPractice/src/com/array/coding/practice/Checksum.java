package com.array.coding.practice;

public class Checksum {

	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 6, 7, 14, 21, 60 };

		int[] findSum = findSum(array, 27);

		int[] findSum1 = findSumSorted(array, 27);

		for (int i : findSum1) {
			System.out.print(i + " ");
		}
	}

	private static int[] findSumSorted(int[] array, int i) {
		int pointer1 = 0;
		int pointer2 = array.length - 1;
		int sum = 0;

		int[] result = new int[2];

		while (pointer1 != pointer2) {
			sum = array[pointer1] + array[pointer2];
			if (sum < i) {
				pointer1++;

			} else if (sum > i) {
				pointer2--;
			} else {
				result[0] = array[pointer1];
				result[1] = array[pointer2];
				return result;
			}
		}
		return array;
	}

	public static int[] findSum(int[] arr, int n) {
		int[] result = new int[2];
		// write your code here
		boolean isFound = false;
		for (int i = 0; i < arr.length; i++) {
			int sub = n - arr[i];
			result[0] = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == sub) {
					result[1] = arr[j];
					isFound = true;
					break;
				}
			}
			if (isFound)
				return result;
		}
		return arr; // return the elements in the array whose sum is equal to the value passed as
					// parameter
	}
}
