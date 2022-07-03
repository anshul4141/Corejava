package com.raystec.oopexercise;

public class Boy extends Human {
	//Overridden method
	public static void eat() {
		System.out.println("Boy is eating");
		
	}
	public static void main(String[] args) {
		//Boy a = new Boy();
		
		Boy.eat();
	}

}
