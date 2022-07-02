package com.raystec.oopexercise;

public class BusinessMan implements RichMan {

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		System.out.println("Donate for Social Work");
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		System.out.println("MAJA NI LIFE");
	}
	
	public static void main(String[] args) {
		RichMan r = new BusinessMan();
		BusinessMan b = new BusinessMan();
		
		r.donation();
		r.party();
		System.out.println("-----------");
		b.donation();
		b.party();
	}

}
