package com.array.coding.practice;

public class FebonacciesSeries {

	public static void main(String[] args) {
		int no1=0;
		int no2=1;
		int sum = 0;
		int total=6;
		System.out.print(no1);
		for(int i=1;i<total;++i) {
			sum= no1+no2;
			System.out.print(", "+no2);
			no1=no2;
			no2=sum;
			
		}
	}

}
