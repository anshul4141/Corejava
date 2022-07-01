package com.reystech.oop;

public class Businessman1 implements Richman, SocialWorker {
    
	public int helptoOthers() {
		return 100000;
	
	}
    public int earnMoney() {
		return 75000;
		
	}
    public int donation() {
		return 6000;
	
	}
    public void party() {
		System.out.println("MAJA NI LIFE");
		
	}
	public static void main(String[] args) {
		Businessman1 bs = new Businessman1();
		
	System.out.println("{SocialWorker} = " + bs.helptoOthers());
	System.out.println("********");
	System.out.println("Total Earn Money = " + bs.earnMoney());
	System.out.println("********");
	System.out.println("Money for Donation " + bs.donation());
	System.out.println("********");
	bs.party();
	
	}
	
}


    
