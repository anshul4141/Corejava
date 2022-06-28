package com.reystech.oop;

public class TestCircle {
	public static void main(String[] args) {
		Circle c = new Circle();
		
		
		c.setColor("red");
		System.out.println(c.getColor());
		c.setBorderwidth(5);
		System.out.println(c.getBorderwidth());
		c.setRadius(2);
		System.out.println(c.getRadius());
		c.area();
		System.out.println("Area of Circle= " + c.area());
		
		
		
		
	}
	
	
	
	
	
	
	

}
