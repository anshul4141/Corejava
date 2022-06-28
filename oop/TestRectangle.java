package com.reystech.oop;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		r.setColor("blue");
		System.out.println(r.getColor());
		r.setBorderwidth(6);
		System.out.println(r.getBorderwidth());
		r.setLength(5);
		System.out.println(r.getLength());
		r.setWidth(10);
		System.out.println(r.getWidth());
		r.area();
		System.out.println("Area of Rectangle = " + r.area());
		
	}

}
