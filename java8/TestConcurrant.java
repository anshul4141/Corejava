package com.rays.java8;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class TestConcurrant {
	
	public static void main(String[] args) {
		
		ArrayBlockingQueue<Integer> a = new ArrayBlockingQueue<>(15);
		
		a.add(45);
		a.add(41);
		a.add(25);
		a.add(45);
		a.add(75);
		a.add(62);
		a.add(14);
		
		Iterator<Integer> it = a.iterator();
		a.add(87);
		while (it.hasNext()) {
			Integer in = (Integer) it.next();
			System.out.println(in);
			
		}
		
	}

}
