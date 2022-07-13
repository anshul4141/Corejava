package com.raystec.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarsheet2 {
	
	public static void main(String[] args) {
		
		Marksheet2 m1 = new Marksheet2("2", "Anshul", "Shrma", 72, 64, 68);
		
		Marksheet2 m2 = new Marksheet2("3", "Anshul", "Gour", 72, 64, 68);
		
		Marksheet2 m3 = new Marksheet2("1", "Anshul", "Prajapati", 72, 64, 68);
		
		ArrayList l = new ArrayList<>();
		
		OrderByLname o = new OrderByLname();
		
		l.add(m1);
		l.add(m2);
		l.add(m3);
		
		Collections.sort(l, o);
		
		Iterator i = l.iterator();
		
		while (i.hasNext()) {
			Marksheet2 mar = (Marksheet2) i.next();
			
			System.out.println(mar.getRollNo()+" "+mar.getFname()+" "+mar.getLname()+" "+mar.getPhy()+" "+mar.getChm()+" "+mar.getMath());
			
		}
		
		
	}

}
