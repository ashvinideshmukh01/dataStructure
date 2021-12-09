package com.array.coding.practice;

public class RemoveEvenNoFromArrsy {

	public static void main(String[] args) {
		RemoveEvenNoFromArrsy removeEven = new RemoveEvenNoFromArrsy();
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] removeEven2 = removeEven.removeEven(array);
		for (int i : removeEven2) {
			System.out.println(i);
		}
	}

	private int[] removeEven(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] % 2 != 0) {
				count++;
			}
		}
		int j = 0;
		int[] newaray = new int[count];
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] % 2 != 0) {
				newaray[j] = array[i];
				j++;
			}
		}
		return newaray;

	}

}
