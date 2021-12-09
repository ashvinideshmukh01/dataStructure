package com.study.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertArraytoList {

	public static void main(String[] args) {
		Employee [] array = new Employee[4];
		array[0]=new Employee("Rajveer","raj",1,5);
		array[1]=new Employee("Ranjit","raj",10,35);
		array[2]=new Employee("Ashvini","raj",11,30);
		array[3]=new Employee("Ahvini","raj",12,31);
		
		List<Employee> list = Arrays.stream(array).collect(Collectors.toList());
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		Map<String, List<Employee>> collect = list.stream().filter(e->e.getAge()>=30).collect(Collectors.groupingBy(e->e.getName()));
		System.out.println(collect);
		long count = list.stream().filter(e->e.getAge()>=30).count();
		System.out.println(count);
		Double avgAge = list.stream().filter(e->e.getAge()>=30).collect(Collectors.averagingLong(e->e.getAge()));
	    System.out.println(avgAge);
	   
	}
	

}
