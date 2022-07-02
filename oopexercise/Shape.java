package com.raystec.oopexercise;

public abstract class Shape {
	
	private String color;
	private int borderWith;
	public static final double PI = 3.14;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderWith() {
		return borderWith;
	}
	public void setBorderWith(int borderWith) {
		this.borderWith = borderWith;
	}
	public abstract double area();
	

}
