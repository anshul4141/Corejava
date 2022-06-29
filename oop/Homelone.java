package com.reystech.oop;

public class Homelone {

	public static void main(String[] args) {

		Bank a = Bank.getBank(3);

		System.out.println(a.getName());
		System.out.println(a.interestRate());

	}

}
