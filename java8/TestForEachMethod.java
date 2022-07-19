package com.rays.java8;

import java.util.ArrayList;
import java.util.List;

public class TestForEachMethod {
	
	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		
		a.add(45);
		a.add(41);
		a.add(25);
		a.add(45);
		a.add(75);
		a.add(62);
		a.add(14);
		
		a.forEach((b) -> System.out.println(b) );
		
	}

}
