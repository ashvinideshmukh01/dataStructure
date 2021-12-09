package com.study.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Chk_FindAny_FindFirst {

	public static void main(String[] args) {
		Employee [] array = new Employee[4];
		array[0]=new Employee("Rajveer","raj",1,5);
		array[1]=new Employee("Ranjit","raj",10,35);
		array[2]=new Employee("Ashvini","raj",11,30);
		array[3]=new Employee("Ashvini","raj",12,31);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Rajveer","raj",1,5));
		list.add(new Employee("Ranjit","raj",10,35));
		list.add(new Employee("Ashvini","raj",11,30));
		list.add(new Employee("Ashvini","raj",11,31));
		 Map<Object, Object> map=list.stream().collect(Collectors.toMap(e->e, e->e.getAge()));
		Set<Object> keySet = map.keySet();
		for (Object object : keySet) {
			System.out.println(object);
		}
		Set<Entry<Object, Object>> entrySet = map.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry.getValue());
		}
		//Optional<Employee> findAny = list.stream().findAny();
		//System.out.println(findAny);
	    //list.stream().findFirst();
		
//		HashSet<String> set = new HashSet<>();
//		set.add(null);
//		set.add("Raj");
//		set.add("Rajveer");
//		
//		Optional<String> findFirst = set.stream().findFirst();
//		System.out.println(findFirst);
//		
//
//	Optional<String> any = set.stream().findAny();
//		System.out.println(any);
	

	}

}
