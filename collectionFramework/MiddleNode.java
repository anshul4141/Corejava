package com.raystec.collectionFramework;

import java.util.LinkedList;

public class MiddleNode {
	
	public static void main(String[] args){

	    // create a linked list using the LinkedList class
	    LinkedList<String> animals = new LinkedList<>();

	    // Add elements to LinkedList
	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Horse");
	    animals.add("Monkey");
	    animals.add("Giraffe");
	    
	  
	    
	    System.out.println("LinkedList: " + animals);
	    System.out.println("----------");
	    System.out.println("Size Of List: " + animals.size());
	    System.out.println("----------");
	    System.out.println(animals.subList(1, animals.size()-1));
	    System.out.println("----------");

	    // access middle element
	    String middle = animals.get(animals.size()/2);
	    System.out.println("Middle Element: " + middle);
	    }
	}


