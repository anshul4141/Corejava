package com.raystec.collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestListCollection {
	

	public static void main(String[] args) {
		
		
		List<Object> s1 = new LinkedList<>();
		
		s1.add(22);
	//	System.out.println(s1);
		s1.add(22.5);
	//	System.out.println(s1);
		s1.add('A');
	//	System.out.println(s1);
		s1.add("KGF");    
	//	s1.lastIndexOf(22.5)
	//	System.out.println(s1.lastIndexOf(22.5));
        System.out.println(s1.subList(0, 3));
        System.out.println("---------------");
        int a = s1.lastIndexOf(22);
        System.out.println(a);
        System.out.println("---------------");
        System.out.println("s1 elements = " + s1);
        System.out.println("---------------");
        s1.set(2, 55);
        System.out.println("set 55 in index no of 2" + s1);
		System.out.println("---------------");
		System.out.println("size of s1 elements: " + s1.size());
		System.out.println("---------------");
	//	System.out.println(s1.get(3)); //For Get Index no.
	//	s1.remove(1);                  //For Remove Index no.
	//	System.out.println(s1);      
	//	s1.remove("KGF");              //For Remove object.
	//	System.out.println(s1);
		
		List<Object> s2 = new ArrayList<>();
		
		s2.add(45);
	//	System.out.println(s2);
		s2.add(22);
	//	System.out.println(s2);
		s2.add("KGF");
	//	System.out.println(s2);
		s2.add('A');
	//	s2.indexOf(22);
		int i = s2.indexOf("KGF");
		System.out.println(i);
		System.out.println("---------------");
		System.out.println("s2 elements = " + s2);
	//	System.out.println(s2.lastIndexOf(s2));
		System.out.println("---------------");
		System.out.println("s2 object isEmpty = " + s2.isEmpty());
		System.out.println("---------------");
		System.out.println("45 contain is in s2 = " + s2.contains(45));
		System.out.println("---------------");
	//	s2.addAll(s1);
	//	System.out.println(s2.subList(0, 3));
		s2.removeAll(s1);             //Remove all elements of s2 which are same in s1
		System.out.println(s2);       //Print all elements of s2 which are not in s1
		System.out.println("---------------");
		s2.retainAll(s1);             //Print all elements of s2 which are same in s1
		System.out.println("s2 element which are same in s1 = " + s2);
		System.out.println("---------------");
	//	s1.retainAll(s2);             //Print all elements of s1 which are same in s2
	//	System.out.println("s1 element which are same in s2 " + s1);
	
		
		
		
		
		
	}
	
}


