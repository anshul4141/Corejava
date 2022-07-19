package com.rays.java8;

public class TestAnonymous {
	
	public static void main(String[] args) {
		
		Richman r = new Richman() {

			@Override
			public void party() {
				System.out.println("Maja Ni Life");
				
			}

			@Override
			public void earnMoney() {
				System.out.println("Pese Vala");
				
			}

			@Override
			public void socialWorker() {
				System.out.println("Madad Gaar");
				
			}
			
		}; r.party();
		   r.earnMoney();
		   r.socialWorker();
		   r.testD();
		   Richman.testStatic();
		   
		   
		   
		
	}

}
