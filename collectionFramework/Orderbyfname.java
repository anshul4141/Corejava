package com.raystec.collectionFramework;

import java.util.Comparator;

public class Orderbyfname implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		// TODO Auto-generated method stub
		return o1.getFname().compareTo(o2.getFname());
	}
	
	

}
