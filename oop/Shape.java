package com.reystech.oop;

public class Shape {
	private String color;
	private int borderwidth;
	public static final double PI = 3.14;
	
	public Shape() {
		
	} 
	
	public Shape(String color,int bw){
		this.color =color;
		this.borderwidth=bw;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public int getBorderwidth() {
		return borderwidth;
	}
	
}
