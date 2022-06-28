package com.raystech.basic;

public class ReverseNo {
	public static void main(String[] args) {
		int number = 123;
		int remainder, revNumber = 0;
		
		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			revNumber = (revNumber  * 10) + remainder;}
		System.out.printf("Reverse Number is %d", revNumber);
		
	}

}
