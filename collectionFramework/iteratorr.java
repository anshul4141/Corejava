package com.raystec.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorr {
	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		
		l.add("One");
		l.add("Two");
		l.add("Three");
		l.add("Four");
		l.add("Five");
		
		Iterator<String> it = l.iterator();
		
		while (it.hasNext()) {
			
			Object obj = it.next();
			
			System.out.println(obj);
			it.remove();		
			
		}
		System.out.println("=========== " + l);
		
	}

}
