package com.array.coding.practice;

import java.util.Arrays;

public class Arrageegativenofirst {

	public static void main(String[] args) {
		int aray[] = {1,-3,4,-5,6,-7};
		int newArray[] = new int [aray.length-1];
		int index =0;
		for(int i =0;i<aray.length-1;i++) {
			if(aray[i]<0) {
				newArray[index++]=aray[i];
			}
			
		}
		for(int i=0;i<aray.length-1;i++) {
			if(aray[i]>0) {
				newArray[index++]=aray[i];
			}
		}
		System.out.println(Arrays.toString(newArray));
	}

}
