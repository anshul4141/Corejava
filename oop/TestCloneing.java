package com.reystech.oop;

public class TestCloneing {
	
	public static void main(String[] args) throws Exception {
		
		
		BankAccount b = new BankAccount();
		
		b.setBankName("bob");
		b.setAccountno(1000500487);
		b.setBalance(40000);
		
		Customer c = new Customer();
		
		c.setId(78);
		c.setName("Anshul Prajapati");
		c.setAddr("Indore");
		c.setAccount(b);
		
		Customer c1 = (Customer) c.clone();
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getAddr());
		System.out.println(c.getAccount().getBankName());
		System.out.println(c.getAccount().getAccountno());
		System.out.println(c.getAccount().getBalance());
		System.out.println("_Now using cloning object_");
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getAddr());
		System.out.println(c1.getAccount().getBankName());
		System.out.println(c1.getAccount().getAccountno());
		System.out.println(c1.getAccount().getBalance());
		
		
		
		
	}

}
