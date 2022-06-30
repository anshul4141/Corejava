package com.reystech.oop;

public class Homelone3 {
	public static void main(String[] args) {
		/*
		 * AxisBank2 a = new AxisBank2(52.2, "axisBank");
		 * 
		 * System.out.println("Bank Name = " + a.getName());
		 * System.out.println("Interest Rate = " + a.getInterest());
		 * System.out.println("----------");
		 * 
		 * HDFC2 h = new HDFC2(17.6, "HDFCBank");
		 * 
		 * System.out.println("Bank Name = " + a.getName());
		 * System.out.println("Interest Rate = " + a.getInterest());
		 * System.out.println("----------");
		 * 
		 * ICICIBank2 i = new ICICIBank2(15.6, "ICICIBank");
		 * 
		 * System.out.println("Bank Name = " + i.getName());
		 * System.out.println("Interest Rate = " + i.getInterest());
		 * System.out.println("----------");
		 */

		Bank2[] bank = new Bank2[3];

		bank[0] = new AxisBank2(11.2, "AxisBank");

		bank[1] = new HDFC2(12.8, "HDFCBank");

		bank[2] = new ICICIBank2(13.7, "ICICBank");

		for (int i = 0; i < bank.length; i++) {

			System.out.println("Bank Name = " + bank[i].getName());
			System.out.println("Interest Rate = " + bank[i].getInterest());
			System.out.println("--------------");

		}

	}
}
