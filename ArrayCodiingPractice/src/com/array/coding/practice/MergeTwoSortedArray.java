package com.array.coding.practice;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		MergeTwoSortedArray merge = new MergeTwoSortedArray();
		int[] array1 = { 1, 2, };
		int[] array2 = { 3,5};
		int[] mergedTwoArray = merge.mergeTwoArray(array1,array2);
		for (int i : mergedTwoArray) {
			System.out.print(i);
		}
	}

	private int [] mergeTwoArray(int[] array1, int[] array2) {
		int newlength = array1.length+array2.length;
		int [] mergedArray = new int [newlength];
		int i =0;
		int j =0;
		int k =0;
		while(i < array1.length && j < array2.length ) {
			if(array1[i] < array2[j]) {
				mergedArray[k] = array1[i];
				k++;
				i++;
			}else {
				mergedArray[k] = array2[j];
				k++;
				j++;
			}
		}
		
		while (i < array1.length) 
            mergedArray[k++] = array1[i++]; 
		
		while (j < array2.length) 
            mergedArray[k++] = array2[j++]; 
		
		return mergedArray;
		
	}

}
