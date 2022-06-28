package com.raystech.basic;

public class Exercise15 {
	public static void main(String[] args) {
		int[] a = {56,89,41,32,52,879,41};
		int b = a[0]; //89, 879
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > b) {
				b = a[i];
				
			}
			
		}
		System.out.println( "Largest No is: " +b);
	}
}
