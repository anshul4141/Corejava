package com.raystec.oopexercise;

public class Triangle extends Shape {
	private int base;
	private int height;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*height;
	}
	public static void main(String[] args) {
		Triangle t = new Triangle();
		
		t.setColor("red");
		System.out.println("Color = " + t.getColor());
		System.out.println("---------------");
		t.setBorderWith(5);
		System.out.println("BorderWith = " + t.getBorderWith());
		System.out.println("---------------");
		t.setBase(8);
		System.out.println("Base = " + t.getBase());
		System.out.println("---------------");
		t.setHeight(10);
		System.out.println("Height = " + t.getHeight());
		System.out.println("---------------");
		
		System.out.println("Total Area " + t.area());
		System.out.println("---------------");
		
		
	}
	

}
