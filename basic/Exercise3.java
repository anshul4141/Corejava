package com.raystech.basic;

import java.util.Random;

public class Exercise3 {
	public static void main(String[] args) {
		for (int a = 0; a < 10; a++) {
		int randomNo = (int) ( + Math.random() * 100);
			System.out.print(" " + randomNo );
		}
		System.out.println();
		System.out.println("------------");
			
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int randomInt = r.nextInt(100);
			System.out.print(" " + randomInt);
			
		
		}
		System.out.println();
		System.out.println("------------");
		
		for (int i = 0; i < 10; i++) {
			double randomD = r.nextDouble();
			System.out.println("" + randomD);
			
			
		}
	}
}