package com.raystec.oopexercise;

public class Circle extends Shape {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		
		c.setColor("red");
		System.out.println("Color = " + c.getColor());
		System.out.println("---------------");
		c.setBorderWith(5);
		System.out.println("BorederWith = " + c.getBorderWith());
		System.out.println("---------------");
		c.setRadius(8);
		System.out.println("Radius = " + c.getRadius());
		System.out.println("---------------");
	
		System.out.println("Area Of Circle = " + c.area());
		System.out.println("---------------");
	}
	

}
