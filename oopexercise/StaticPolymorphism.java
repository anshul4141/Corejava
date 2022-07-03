package com.raystec.oopexercise;

public class StaticPolymorphism {
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}public void add(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}public void add(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
		
	}public void add(String c) {
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		
		StaticPolymorphism obj = new StaticPolymorphism();
		
		obj.add(50, 25);
		obj.add(25, 72, 63);
		obj.add(25, 15, 13, 72);
		obj.add("Anshul");
	}
	
		
		
	}
	


