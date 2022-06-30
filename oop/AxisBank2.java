package com.reystech.oop;

public class AxisBank2 extends Bank2 {
	private double interest;
	private String name;
	
	public AxisBank2() {
		
	}
	
	public AxisBank2(double i, String n) {
		interest = i;
		name = n;
	}
	
	public double getInterest() {
		return interest;
	}
	
	public String getName() {
		return name;
	}
	
}
