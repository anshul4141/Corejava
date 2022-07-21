package com.raystec.collectionFramework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Shorted {
	
	public static void main(String[] args) {
		
        List s1 = new LinkedList<>();
		
		s1.add(22);
		s1.add(5);
		s1.add(12);
		s1.add(10);    
		
		Collections.sort(s1);
		
		System.out.println(s1);
		
	}

}
