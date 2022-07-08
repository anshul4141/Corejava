package com.raystech.basic;

public class ExerciseI17 {
	
	public static void main(String[] args) {

		
		int[] a = {1,2,3,4,5,6,7,8};
		int[] b = {1,2,3,4,5,6,7};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					break;
					
				} else if (j == (b.length - 1)) {
					System.out.println(a[i]);
					
				}
				
			}
			
			
		}
		
	}
	
}
	
