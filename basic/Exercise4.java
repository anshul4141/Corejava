package com.raystech.basic;

public class Exercise4 {
	public static void main(String[] args) {
		int a; 
		int fact = 1;
		int number = 3;
		for (a = 1; a <= 3; a++) {

			fact = fact * a;
		}
		System.out.println("Factorial of " + number + " is " + fact);

	}
}
