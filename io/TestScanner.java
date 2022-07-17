package com.raystec.io;

import java.util.Scanner;

public class TestScanner {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value");
		int a = sc.nextInt();
		System.out.println("Enter The value");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Total = " + c);
		
	}

}
