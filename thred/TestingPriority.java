package com.raystec.thred;


public class TestingPriority extends Thread {
	
	private String  name;
	
	public TestingPriority() {
		
	}
	
	public TestingPriority (String n) {
		name = n;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread .sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " Hello " + name);
			
		}
		
	}
	public static void main(String[] args) {
		
		TestingPriority t1 = new TestingPriority("Anshul");
		TestingPriority t2 = new TestingPriority("Hansa");
		
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t1.start();
		t2.start();
		
		
	}

}
