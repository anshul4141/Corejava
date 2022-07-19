package com.rays.java8;

import java.util.Arrays;

public class TestParallel {
	
	public static void main(String[] args) {
		
		int [] a = {5,8,1,4,7,5,9,6,8,2};
		
		Arrays.parallelSort(a);
		
		for (int i : a) {
			
			System.out.println(i);
			
		}
		
	}

}
