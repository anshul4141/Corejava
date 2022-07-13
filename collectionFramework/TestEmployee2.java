package com.raystec.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployee2 {
	
	public static void main(String[] args) {
	
		Employee2 e1 = new Employee2("Shyam", "Yadav", 20, 5000);
	
	    Employee2 e2 = new Employee2("Aman", "Yadav", 22, 50000);
	
	    Employee2 e3 = new Employee2("Baban", "Yadav", 24, 45000);
	
	    ArrayList l = new ArrayList<>();
	
	    OrderByFname2 f = new OrderByFname2();
	
     	l.add(e1);
    	l.add(e2);
        l.add(e3);
        
        Collections.sort(l, f);
        
        Iterator it = l.iterator();
        
        while (it.hasNext()) {
			Employee2 em = (Employee2) it.next();
			
			System.out.println(em.getFname()+" "+em.getLname()+" "+em.getAge()+" "+em.getSalary());
			
		}
	
	
}

}
