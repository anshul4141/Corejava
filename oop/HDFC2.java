package com.reystech.oop;

public class HDFC2 extends Bank2 {
	private double interest;
	private String name;
	
	public HDFC2() {
		
	}
	
	public HDFC2(double i, String n) {
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
