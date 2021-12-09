package com.array.coding.practice;

public class ReverseNo {

	public static void main(String[] args) {
		int num=123;
		int reminder=0;
		int temp=0;
		while(num>0) {
			reminder=num%10;
			temp=temp*10+reminder;
			num=num/10;
		}
		System.out.println(temp);
	}

}
