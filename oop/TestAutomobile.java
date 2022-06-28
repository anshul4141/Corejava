package com.reystech.oop;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile a = new Automobile();
		
		a.setMake("MARUTI SUJUKI");
		a.setColor("Red");
		a.setSpeed(100);
		a.setGear(6);
		
		
		
		System.out.println(a.getMake());
		System.out.println(a.getColor());
		System.out.println(a.getSpeed());
		System.out.println(a.getGear());
		a.changGear();
		a.brekk();
		
		
		
		  
		
		
		
	}

}
