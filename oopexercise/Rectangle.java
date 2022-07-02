package com.raystec.oopexercise;

public class Rectangle extends Shape {
	private int length;
	private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		r.setColor("red");
		System.out.println("Color = " + r.getColor());
		System.out.println("---------------");
		r.setBorderWith(5);
		System.out.println("BorderWith = " + r.getBorderWith());
		System.out.println("---------------");
		r.setLength(10);
		System.out.println("Length = " + r.getLength());
		System.out.println("---------------");
		r.setWidth(15);
		System.out.println("Width = " + r.getWidth());
		System.out.println("---------------");
		
		System.out.println("Total Area =  " + r.area());
		System.out.println("---------------");
	}
	

}


