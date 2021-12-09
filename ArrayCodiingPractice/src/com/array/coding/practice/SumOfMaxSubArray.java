package com.array.coding.practice;

public class SumOfMaxSubArray {

	public static void main(String[] args) {
		int aray[] = {1,2,3,4,-5};
		int currmax=aray[0];
		int gloalmax=aray[0];
		for(int i=1;i<=aray.length-1;i++) {
			if(currmax<0) {
				currmax=aray[i];
			}else{
				currmax=currmax+aray[i];
			}
			if(currmax>gloalmax) {
				gloalmax=currmax;
			}
		}
		System.out.println(gloalmax);
	}

}
