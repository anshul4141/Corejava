package com.raystec.thred;

public class TestRunnable extends TestThred implements Runnable {
	
	String name;
	
	public TestRunnable() {
		
	}
	
	public TestRunnable (String n) {
		name = n;
		
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + name);
			
		}
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new TestRunnable("Anshul"));
		Thread t2 = new Thread(new TestRunnable("Prajapati"));
		t1.start();
		t2.start();
		
		
		
	}

}
