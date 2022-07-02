package com.raystec.oopexercise;

public class Student implements RichMan {

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		System.out.println("Donation For Anaath Ashram");
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		System.out.println("Ejoy School Party");
		
	}
	public static void main(String[] args) {
		RichMan r = new Student();
		Student s = new Student();
		
		r.donation();
		r.party();
		System.out.println("------------");
		s.donation();
		s.party();
	}

}
