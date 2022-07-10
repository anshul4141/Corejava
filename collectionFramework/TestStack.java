package com.raystec.collectionFramework;

import java.util.Stack;

public class TestStack {
	
	public static void main(String[] args) {
		  
		Stack s = new Stack();
		
		s.push(1);
		s.push('a');
		s.push(1.5);
		s.push("Anshul");
		//s.push(1);
		
	//	System.out.println(s);
		//System.out.println("---------");
		System.out.println(s.pop());   //Remove 
		System.out.println(s.pop());
		System.out.println(s.peek());  // peek always select last element
		
		
		
	}

}
