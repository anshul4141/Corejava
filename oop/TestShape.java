package com.reystech.oop;

public class TestShape {
	public static void main(String[] args) {
		
		
		Shape s = new Shape("red",89);
		
		//System.out.println(s.PI);
		System.out.println(Shape.PI);
		
		
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth()); 
		
		
		
	}

}
