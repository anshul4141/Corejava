package com.reystech.oop;

public class Automobile2 {
	private String make;
	private String color;
	private int speed;
	public static final int gear = 6;
	
	public Automobile2() {
		
	}
    public Automobile2(String m, String c, int s) {
    	make = m;
    	color = c;
    	speed = s;
		
	}
	public String getMake() {
		return make;
	}
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	public void brekk() {
		if (getSpeed() > 70) {
			System.out.println("brekkk!!!");
		}
	}
	public void changGear() {
		if(getSpeed() == 10) {
			System.out.println("gear = " + 1);
		}
		if(getSpeed() == 20) {
			System.out.println("gear = " + 2);
		}
		if(getSpeed() == 30) {
			System.out.println("gear = " + 3);
		}
		if(getSpeed() == 40) {
			System.out.println("gear = " + 4);
		}
		if(getSpeed() == 100) {
			System.out.println("gear = " + 5);
		
		} else {
			System.out.println("gear = " + 6);
		}

	

}
	}
