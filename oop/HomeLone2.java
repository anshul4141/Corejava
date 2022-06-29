package com.reystech.oop;

public class HomeLone2 {
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			Bank b = Bank.getBank(i);
			
			System.out.println(b.getName());
			System.out.println(b.interestRate());
			System.out.println("------------------");
			
			
		}
	}

}
