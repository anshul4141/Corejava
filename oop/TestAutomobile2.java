package com.reystech.oop;

public class TestAutomobile2 {
	public static void main(String[] args) {
		Automobile2 a = new Automobile2("MARUTI SUZUKI", "red", 120);
		
		System.out.println(a.getMake());
		System.out.println(a.getColor());
		System.out.println(a.getSpeed());
		System.out.println(Automobile2.gear);
		a.changGear();
		a.brekk();
		
		
	}

}
