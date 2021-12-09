package com.study.stream.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	//Given a list of integers, find out all the even numbers exist in the list using Stream functions?
	
	//Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
	
	//Q3 How to find duplicate elements in a given integers list in java using Stream functions?
	
	//Q4 Given the list of integers, find the first element of the list using Stream functions?
	
	//Q5 Given a list of integers, find the total number of elements present in the list using Stream functions?
	
	//
	//Q6 Given a list of integers, find the maximum value element present in it using Stream functions?
	
	//Q7 Given a String, find the first non-repeated character in it using Stream functions?
	
	//Given a String, find the first repeated character in it using Stream functions?
	
	//Given a list of integers, sort all the values present in it using Stream functions?
	
	//Given a list of integers, sort all the values present in it in descending order using Stream functions?
	
	// Given a list of integers, sort all the values present in it in descending order using Stream functions?
	
	
	public static void main(String[] args) {
		ArrayList<Integer> integerLit = new ArrayList<>();
		integerLit.add(1);
		integerLit.add(1);
		integerLit.add(11);
		integerLit.add(11);
		integerLit.add(33);
		integerLit.add(20);
		
		//List<Integer> list = integerLit.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		//System.out.println("lit of even nos: "+list);
		
		Predicate<Integer> p = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				String string = Integer.toString(t);
				char test = string.charAt(0);
				String string2 = Character.toString(test);
				if(string2.equals("1")) {
				return true;
				}
				return false;
			}
		};
		
		//List<Integer> list2 = integerLit.stream().filter(p).collect(Collectors.toList());
		//System.out.println("list of no which is start with 1 "+list2);
		
		//	find duplicate
		
		HashSet<Integer> set = new HashSet<>();
		
//		List<Integer> list3 = integerLit.stream().filter(i->!set.add(i)).collect(Collectors.toList());
//		System.out.println(list3);
		
		//Integer integer = integerLit.stream().findFirst().get();
//		Integer integer = integerLit.stream().findAny().get();
//		System.out.println(integer);
		
//		int count=0;
//		long count2 = integerLit.stream().count();
//		System.out.println(count2);
		
		Optional<Integer> max = integerLit.stream().max(Integer::compare);
		System.out.println(max);
		
		 System.out.println(integerLit.stream().sorted().toList());
		 System.out.println(integerLit.stream().sorted(Collections.reverseOrder()).toList());
		//System.out.println(sorted);
	}

}
