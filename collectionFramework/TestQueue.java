package com.raystec.collectionFramework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
	
	public static void main(String[] args) {
		
		Queue s1 = new PriorityQueue();  // In PriorityQueue all elements must be same
		
		s1.add(85);
		s1.add(5);
		s1.add(9);
		s1.add(7);
		
		System.out.println(s1);
		System.out.println("----------------");
		
		Queue s2 = new LinkedList<>();   // In LinkedList print all type elements
		
		s2.add(72);
		s2.add(8.2);
		s2.add('A');
		s2.add("XYZ");
		System.out.println(s2);
		System.out.println(s2.remove());
		System.out.println(s2.remove());
		System.out.println(s2.remove());
		System.out.println(s2.remove());
		System.out.println(s2.poll());
		
		
	}

}
