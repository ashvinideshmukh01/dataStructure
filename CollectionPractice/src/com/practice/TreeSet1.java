package com.practice;

import java.util.Comparator;

public class TreeSet1 {

	public static void main(String[] args) {
//		java.util.TreeSet<String> set = new java.util.TreeSet<>();
//		set.add("This");
//		set.add("is");
//		set.add("This");
//		set.add("ThisisThis");
//		
//		for (String s : set) {
//			System.out.println(s);
//		}
	
	
	java.util.TreeSet<Employee> set1 = new java.util.TreeSet<>();
	set1.add(new Employee("Raj", 10));
	set1.add(new Employee("Raj", 10));
	
	for (Employee employee : set1) {
		System.out.println(employee);
	}
	
	
	
	}
}

