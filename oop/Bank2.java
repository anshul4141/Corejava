package com.reystech.oop;

public class Bank2 {
	private double interest;
	private String name;
	
	public Bank2() {
		
	}
	
	public Bank2(double i, String n) {
		
	}
	
	public double getInterest() {
		return interest;
	}
	
	public String getName() {
		return name;
	}
	
	
	public static Bank2 getBank(int i) {
		if (i == 1)
			return new AxisBank2();

		if (i == 2)
			return new HDFC2();

		if (i == 3)
			return new ICICIBank2();
		return null;
}
	}
