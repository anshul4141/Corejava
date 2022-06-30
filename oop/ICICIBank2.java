package com.reystech.oop;

public class ICICIBank2 extends Bank2 {
	private double interest;
	private String name;

	public ICICIBank2() {

	}

	public ICICIBank2(double i, String n) {
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
