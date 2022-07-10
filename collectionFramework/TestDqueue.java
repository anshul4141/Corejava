package com.raystec.collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDqueue {
	
	public static void main(String[] args) {
		
		Deque s = new ArrayDeque();
		
		s.add(5);
		s.add(11);
		s.add(15);
		s.add(25);
		s.add(58);
		s.addFirst(47);
		s.offerLast(51);
		System.out.println(s);
		System.out.println("-----------------");
		System.out.println(s.getFirst());
		System.out.println("-----------------");
		System.out.println(s.getLast());
		System.out.println("-----------------");
		s.pollFirst();
		System.out.println(s);
		
		
	}
	
	

}
