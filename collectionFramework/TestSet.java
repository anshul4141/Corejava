package com.raystec.collectionFramework;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSet {
	
	public static void main(String[] args) {
		
		Set s = new HashSet();  //HashSet is'nt print sequence wise
		Set i = Collections.synchronizedSet(s);
		
		i.add(1);
		i.add(5.2);
		i.add('a');
		i.add("Anshul");
		
		System.out.println(i);
		System.out.println("---------------");
		
		Set s1 = new LinkedHashSet();  //LinkedHashSet print insertion
		
		s1.add(1);
		s1.add(5.2);
		s1.add('a');
		s1.add("Anshul");
		
		System.out.println(s1);
		System.out.println("---------------");
		
		Set s2 = new TreeSet();      //TreeSet print Ascending
		
		s2.add('m');
		s2.add('d');
		s2.add('w');
		s2.add('z');
		
		System.out.println(s2);
		System.out.println("---------------");
		
		SortedSet s3 = new TreeSet();
		
		s3.add(5);
		s3.add(6);
		s3.add(7);
		s3.add(8);
		
		System.out.println(s3.headSet(6));
		
		
		
		
		
		
	}

}
