package com.raystech.basic;

public class Exercise7 {
	public static void main(String[] args) {
		int a = 0;
		for(int i = 100; i <= 200; i++) {
			if(i % 7 == 0) {
				a = a+i;
				
			}
		}
		System.out.println(a);
	}

}
