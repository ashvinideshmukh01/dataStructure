package com.array.coding.practice;

import java.util.Arrays;

public class ArrangeinMxMnsequence {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int maxIdx = arr.length - 1;
	    int minIdx = 0;
	    int maxElem = arr[maxIdx] + 1;
	    for( int i = 0; i < arr.length; i++) {
	      if (i % 2 == 0) { 
	        arr[i] += (arr[maxIdx] % maxElem ) * maxElem;
	        maxIdx -= 1;
	      }
	      else {
	        arr[i] += (arr[minIdx] % maxElem ) * maxElem;
	        minIdx += 1;
	      }
	    }
	    for( int i = 0; i < arr.length; i++){
	      arr[i] = arr[i] / maxElem;
	    }
	    System.out.println(Arrays.toString(arr));
	  }
	

}
