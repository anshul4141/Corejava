package com.reystech.oop;

public class Circle extends Shape2 {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		return PI*radius*radius;
	}
	

}
