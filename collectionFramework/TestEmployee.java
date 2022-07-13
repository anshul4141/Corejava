package com.raystec.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Shyam", 20, 5000);
		
		Employee e2 = new Employee("Aman", 22, 50000);
		
		Employee e3 = new Employee("Suresh", 24, 45000);
		
		ArrayList l = new ArrayList<>();
		
		OrderBySalary s = new OrderBySalary();
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		
		Collections.sort(l, s);
		
		
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
		
		Employee em = (Employee) it.next();
		
		System.out.println(em.getName()+" "+em.getAge()+" "+em.getSalary());
			
		}
		}
	}


