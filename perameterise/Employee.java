package com.raystec.perameterise;

public class Employee extends Person {
	private String designation;

	public Employee() {
		System.out.println("Defoult Employee");
		
	}
	public Employee(String fn, String ln, String des) {
		super (fn,ln);
		designation = des;
		System.out.println("3 perametar Employee " + designation);
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Employee e = new Employee("Vijay ", "Jain ", "Developar");
	}
	

}
