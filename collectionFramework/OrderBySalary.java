package com.raystec.collectionFramework;

import java.util.Comparator;

public class OrderBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getSalary()-o2.getSalary();
		
		// TODO Auto-generated method stub
		
	}

}
