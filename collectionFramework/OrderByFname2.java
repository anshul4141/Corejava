package com.raystec.collectionFramework;

import java.util.Comparator;

public class OrderByFname2 implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		// TODO Auto-generated method stub
		return o1.getFname().compareTo(o2.getFname());
	}

}
