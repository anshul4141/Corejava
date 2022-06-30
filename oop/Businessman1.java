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
    public int party() {
		return 20000;
		
	}
	public static void main(String[] args) {
		Businessman1 bs = new Businessman1();
		
	System.out.println(bs.helptoOthers());
	System.out.println("********");
	System.out.println(bs.earnMoney());
	System.out.println("********");
	System.out.println(bs.donation());
	System.out.println("********");
	System.out.println(bs.party());
	}
}

    
