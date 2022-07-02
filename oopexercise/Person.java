package com.raystec.oopexercise;

public class Person {
	
	private String firstName;
	private String lastName;
	
	public Person(String fi, String la) {
		firstName = fi;
		lastName = la;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName+lastName;
	}
	public static void main(String[] args) {
		Person p = new Person("anshul ", "prajapati");
		
		System.out.println(p.toString());
	}

}
