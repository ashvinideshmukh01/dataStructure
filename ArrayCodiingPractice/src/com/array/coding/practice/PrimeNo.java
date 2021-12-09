package com.array.coding.practice;

public class PrimeNo {

	public static Object isPrime(int num, int i) {
        // First base case
        if (num < 2) {
            return false;
        }
        // Second base case
        else if (i == 1) {
            return true;
        }
        // Third base case
        else if (num%i == 0) {
            return false;
        }
        // Recursive case
        else {
            return isPrime(num, i-1);
        }
    }   
	public static void main(String[] args) {
//		Object prime = isPrime(13,3);
//		System.out.println(prime);
		
		int num=12;
		if(num==0||num==1) {
			System.out.println("The numbers 11 and 00 are neither prime nor composite.");
		}
		for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			System.out.println("not prime");
			break;
		}else {
			System.out.println("prime");
			break;
		}
		}
	}

}
