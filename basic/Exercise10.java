package com.raystech.basic;

public class Exercise10 {
	public static void main(String[] args) {
		int num = 153;
		int c = 0;
		int sum = 0;
		int r;
		c = num;
		
		while ( c != 0) {
			r = c % 10;
			sum = sum + r * r * r;
			c = c / 10; 
			
		
		}
		if ( num == sum) {
			System.out.println(num + " is Armstrong");
		} else {
			System.out.println(num + " is not Armstrong");
		}
	}

}
