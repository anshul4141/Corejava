package com.raystec.oopexercise;

public class StaticPolymorphism {
	public static void add(int a, int b) {
		System.out.println(a+b);
		
	}public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}public static void add(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
		
	}public static void add(String c) {
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		
		StaticPolymorphism.add(50, 25);
		StaticPolymorphism.add(25, 72, 63);
		StaticPolymorphism.add(25, 15, 13, 72);
		StaticPolymorphism.add("Anshul");
	}
	
		
		
	}
	


