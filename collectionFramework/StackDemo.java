package com.raystec.collectionFramework;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st=new Stack<Character>();
		Stack<Character> st1=new Stack<Character>();         
		for(int i=65;i<=90;i++) {   
			
			st.push((char)i);
		}
		
		Iterator<Character> it=st.iterator();
		while (it.hasNext()) {
			st1.push(st.pop());
			
		}
		
		for (Object obj : st1) {
			System.out.println(obj);
			
			
		}
		
		Iterator<Character> it2 = st1.iterator();
		while (it2.hasNext()) {
		  System.out.println(st1.pop());
			
		}
		
	}

}
