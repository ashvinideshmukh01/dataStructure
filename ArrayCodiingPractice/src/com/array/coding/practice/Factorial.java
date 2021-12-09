package com.array.coding.practice;

public class Factorial {
	public static int calFact(int n) {
		int fact=1;
		if(n==0||n==1) {
			return n;
		}else {
			for(int i =n;i>=1;i--) {
			fact=fact*i;
			}
			return fact;
		}
	}
	public static void main(String[] args) {
		int fact = calFact(5);
		System.out.println(fact);
	}

}
