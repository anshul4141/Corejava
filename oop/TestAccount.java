package com.reystech.oop;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account("0100050004545", "saving", 20000);
		
		
		System.out.println(a.getNumber());
		System.out.println(a.getType());
		System.out.println(a.getBalance());
		a.deposite(5000);
		System.out.println("After Deposit= " + a.getBalance());
		a.withdrawl(2000);
		System.out.println("After withdrawl= " + a.getBalance());
		a.fundtransfer(3000);
		System.out.println("After fundtrans= " + a.getBalance());
		a.paybill(500);
		System.out.println("After paybill= " + a.getBalance());
		
		System.out.println("Present Balance= " + a.getBalance());
		
		
		
		
		
	}

}
