package com.practice;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
//		java.util.PriorityQueue<Integer> queue = new java.util.PriorityQueue<>();
//		queue.add(1);
//		queue.add(10);
//		queue.add(12);
//		queue.add(2);
//		while(queue.isEmpty()==false) {
//			System.out.println(queue.remove());
//		}
		
		
		PriorityQueue<Employee> equeue = new PriorityQueue<Employee>();
		equeue.add(new Employee("rajveer"));
		equeue.add(new Employee("rejveer"));
		equeue.add(new Employee("rujveer"));
		while(equeue.isEmpty()==false) {
			System.out.println(equeue.remove());
		}
	}

}
