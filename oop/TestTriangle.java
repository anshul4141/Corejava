package com.reystech.oop;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle s = new Triangle();
		
		s.setColor("red");
		s.setBorderwidth(9);
		s.setBase(5);
		s.setHeight(15);
		s.area();
		
		System.out.println(s.getColor());
		System.out.println(s.getBorderwidth());
		System.out.println(s.getBase());
		System.out.println(s.getHeight());
		System.out.println("Area of Triangle= " + s.area());
		
	}

}
