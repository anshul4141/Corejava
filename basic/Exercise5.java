package com.raystech.basic;

public class Exercise5 {
	public static void main(String[] args) {
	int number = 123;
	int a = 0;
	while (number > 0) {
		a = number % 10;
		System.out.print(a);
		number = number / 10;
	}
	}
	}